package calc;

public class Pessoa {
	String nome;
	int idade;
	int nDependentes;
	double valorPencao;
	double descontoINSS;
	double valorIR;
	double remuneracaoBruta;
	double remuneracaoDeduzida;
	double remuneracaoLiquida;
	
	public Pessoa() {
		//Generico
	}
	
	Pessoa(String nome, int idade, int nDependentes, double valorPencao, 
			double descontoINSS, double valorIR, double remuneracaoBruta,
			double remuneracaoDeduzida, double remuneracaoLiquida){
		
		this.nome = nome;
		this.idade = idade;
		this.nDependentes = nDependentes;
		this.valorPencao = valorPencao;
		this.descontoINSS = descontoINSS;
		this.valorIR = valorIR;
		this.remuneracaoBruta = remuneracaoBruta;
		this.remuneracaoDeduzida = remuneracaoDeduzida;
		this.remuneracaoLiquida = remuneracaoLiquida;
	}
}
