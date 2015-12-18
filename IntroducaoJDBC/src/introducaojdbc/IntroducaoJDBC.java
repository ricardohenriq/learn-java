package introducaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IntroducaoJDBC {
    ///SERA NECESSARIO IMPORTAR CLASSES PROPRIAS
    //TESTADO NO Oracle 11g Express Edition
    //O "DRIVER" JDBC E ENCONTRADO DENTRO DO
    //PROPRIO Oracle
    //O CAMINHO E MAIOS OU MENOS ESTE
    //C:/oraclexe/app/oracle/product/11.2.0/server/jdbc
    //POSSUI TRES .jar
    //PARA USAR UM DESTES TEM DE INFORMAR O classpath A IDE
    //PESQUISE POR ADICIONAR .jar EXTERNO NO WEB
    public static void main(String[] args) throws SQLException {
        //url TEM DE CONTER O PROTOCOLO DE COMUNICAO COM O 
        //BANCO DE DADOS(jdbc), O SUBPROTOCOLO(oracle:thin "neste caso")
        //O SERVIDOR ONDE ESTA RODANDO O SERVIDOR(localhost ou ip)
        //A PORTA TCP(1521), NOME DO BANCO(xe "neste caso")
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection conexao = DriverManager.getConnection(url, "usuario", "senha");
        //IRA RETORNAR UMA CONEXAO COM O BANCO
        
        //TEREI DE CRIAR UM OBJETO statment PARA ENCAMINHAR REQUISICOES PARA 
        //O SERVIDOR
        String sql = "select codigo, nome from pessoa";
        PreparedStatement stm = conexao.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        
        while(rs.next()){
            //POSICOES DE COLUNAS COMECAM EM "1"
            System.out.print(rs.getString(1));
            System.out.println(rs.getString("nome"));
        }
        
        rs.close();
        stm.cancel();
        conexao.close();
        
    }
}
