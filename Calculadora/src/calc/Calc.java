package calc;

import java.util.List;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Calc {
	
	public static void main(String[] args) throws SQLException{
		
		Pessoa objPessoa = new Pessoa();
		CalculosIRINSS objCalculosIRINSS = new CalculosIRINSS();
		Banco objBanco = new Banco();
		Scanner entrada = new Scanner(System.in);
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe ";
		Connection con = DriverManager.getConnection(url, "ricardo", "ricardo");
		
		int opcao=0;
		
		do{
			System.out.println("Selecione uma Opcao:");
			System.out.println("\t1 - Calcular e Armazenar a Remuneracao Liquida");
			System.out.println("\t2 - Exibir todo o Banco de Dados");
			System.out.println("\t0 - Sair");
			System.out.println("Opcao: ");
			opcao = Integer.parseInt(entrada.nextLine());
			switch(opcao){
				case 0:
					break;
				case 1: 
					System.out.println("Calcular Imposto de Renda");
					System.out.println("Didigte seu Nome: ");
					objPessoa.nome = entrada.nextLine();
					
					System.out.println("Didigte sua Idade: ");
					objPessoa.idade = Integer.parseInt(entrada.nextLine());
					
					System.out.println("Didigte Remuneracao Bruta: ");
					objPessoa.remuneracaoBruta = Double.parseDouble(entrada.nextLine());
					
					System.out.println("Didigte Numero de Dependentes: ");
					objPessoa.nDependentes = Integer.parseInt(entrada.nextLine());
					
					System.out.println("Didigte Valor da Pencao: ");
					objPessoa.valorPencao = Double.parseDouble(entrada.nextLine());

					objCalculosIRINSS.calcularINSS(objPessoa);
					objCalculosIRINSS.calcudaDeducao(objPessoa);
					objCalculosIRINSS.calcularIR(objPessoa);
					objBanco.insercao(con, objPessoa);
					
					System.out.println("Nome: "+objPessoa.nome);
					System.out.println("Idade: "+objPessoa.idade);
					System.out.println("Numero de Dependentes: "+objPessoa.nDependentes);
					System.out.println("Valor da Pencao: "+objPessoa.valorPencao);
					System.out.println("Desconto do INSS: "+objPessoa.descontoINSS);
					System.out.println("Valor IR: "+objPessoa.valorIR);
					System.out.println("Remuneracao Bruta: "+objPessoa.remuneracaoBruta);
					System.out.println("Remuneracao Deduzida: "+objPessoa.remuneracaoDeduzida);
					System.out.println("Remuneracao Liquida: "+ objPessoa.remuneracaoLiquida);
					break;
				case 2:
					List<Pessoa> listPessoa = objBanco.recuperacao(con);
					for(Pessoa pessoa : listPessoa){
						System.out.println("Nome: "+pessoa.nome);
						System.out.println("Idade: "+pessoa.idade);
						System.out.println("Numero de Dependentes: "+pessoa.nDependentes);
						System.out.println("Valor da Pencao: "+pessoa.valorPencao);
						System.out.println("Desconto do INSS: "+pessoa.descontoINSS);
						System.out.println("Valor IR: "+pessoa.valorIR);
						System.out.println("Remuneracao Bruta: "+pessoa.remuneracaoBruta);
						System.out.println("Remuneracao Deduzida: "+pessoa.remuneracaoDeduzida);
						System.out.println("Remuneracao Liquida: "+ pessoa.remuneracaoLiquida);
						System.out.println("\n*******************\n");
					}
					break;
				default:
					System.out.println("Opcao Invalida");
			}
		}while(opcao!=0);
		con.close();
	}
}
