package calc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Banco {

	void insercao(Connection con, Pessoa objPessoa) throws SQLException{
		
		String sqlInsert = "insert into pessoa values (?,?,?,?,?,?,?,?,?)";
		
		try(PreparedStatement stm = con.prepareStatement(sqlInsert)){
			stm.setString(1, objPessoa.nome);
			stm.setInt(2, objPessoa.idade);
			stm.setInt(3, objPessoa.nDependentes);
			stm.setDouble(4, objPessoa.valorPencao);
			stm.setDouble(5, objPessoa.descontoINSS);
			stm.setDouble(6, objPessoa.valorIR);
			stm.setDouble(7, objPessoa.remuneracaoBruta);
			stm.setDouble(8, objPessoa.remuneracaoDeduzida);
			stm.setDouble(9, objPessoa.remuneracaoLiquida);
			stm.executeUpdate();
		}
		
	}
	
	List<Pessoa> recuperacao(Connection con) throws SQLException{
		List<Pessoa> listaPessoa = new ArrayList<>();
		String sqlSelect = "select * from pessoa";
		try(PreparedStatement stm = con.prepareStatement(sqlSelect);
			ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				listaPessoa.add(new Pessoa(rs.getString(1),rs.getInt(2),rs.getInt(3), 
						rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), 
						rs.getDouble(7), rs.getDouble(8),rs.getDouble(9)));
			}
		}
		return listaPessoa;
	}
}
