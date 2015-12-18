package contacrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCRUD {
    
    public void criar(Connection conexao, Conta conta) throws SQLException{
        String sql = "insert into conta values(?,?,?)";
        try(PreparedStatement stm = conexao.prepareStatement(sql)){
            stm.setInt(1, conta.numero);
            stm.setString(2, conta.nome);
            stm.setDouble(3, conta.saldo);
            stm.executeUpdate();
        }
    }
    
    public List<Conta> ler(Connection conexao) throws SQLException{
        List<Conta> listaContas = new ArrayList<>();
        String sql = "select * from conta";
        try(PreparedStatement stm = conexao.prepareStatement(sql);
            ResultSet rs = stm.executeQuery(sql)){
            while(rs.next()){
                listaContas.add(new Conta(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
            }
        }
        return listaContas;
    }

    public void excluir(Connection conexao, Conta conta) throws SQLException{
        String sql = "delete conta where numero=?";
        try(PreparedStatement stm = conexao.prepareStatement(sql)){
            stm.setInt(1, conta.numero);
            stm.executeUpdate();
        }
    }
    
    public void alterar(Connection conexao, Conta conta) throws SQLException{
        String sql = "update conta set cliente=?, saldo=? where numero=?";
        try(PreparedStatement stm = conexao.prepareStatement(sql)){
            stm.setString(2, conta.nome);
            stm.setDouble(3, conta.saldo);
            stm.setInt(1, conta.numero);
            stm.executeUpdate();
        }
    }
    
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try(Connection conexao = DriverManager.getConnection(url,"usuario","senha")){
            ContaCRUD contacrud = new ContaCRUD();
            Conta conta1 = new Conta(1,"Ricardo",9999.9);
            Conta conta2 = new Conta(2,"Bill Gates",8888.8);
            Conta conta3 = new Conta(3,"Steve Jobs",7777.7);
            
            contacrud.criar(conexao, conta1);
            contacrud.criar(conexao, conta2);
            contacrud.criar(conexao, conta3);
            
            List<Conta> contas = contacrud.ler(conexao);
            for(Conta conta : contas){
                System.out.println(conta);
            }
        } 
    }
}
