package incluirdadosjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirDadosJDBC {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sql = "insert into pessoa values(?,?,?,?)";
        String[] pessoas = {"ricardo","inacio","henrique","bill gates"};
        try(Connection conexao = DriverManager.getConnection(url, "usuario", "senha")){            
            try(PreparedStatement stm = conexao.prepareStatement(sql)){
                for(int i = 0; i<pessoas.length;i++){
                    stm.setInt(1, i+4);
                    //i+4 PQ JA INSERI ANTERIORMENTE 3 REGISTROS NO BD
                    stm.setString(2,pessoas[i]);
                    stm.setString(3,"M");
                    stm.setString(4,pessoas[i].toLowerCase()+"@hotmail.com");
                    stm.addBatch();
                }
                stm.executeBatch();
            }catch(SQLException e){
                
            }
            sql = "select nome, email from pessoa";
            try(PreparedStatement stm2 = conexao.prepareStatement(sql)){
            ResultSet rs = stm2.executeQuery(sql);
                while(rs.next()){
                    System.out.print(rs.getString(1));
                    System.out.println(rs.getString(2));
                }
            }catch(SQLException e){
                
            }
        }
    }
}
