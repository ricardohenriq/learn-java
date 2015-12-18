package calc;

public class CalculosIRINSS {
	
	double calcularINSS(Pessoa objPessoa){
		if(objPessoa.remuneracaoBruta <= 1317.07){
			return objPessoa.descontoINSS = (objPessoa.remuneracaoBruta * 8) / 100;
		}else if(objPessoa.remuneracaoBruta >= 1317.08 && objPessoa.remuneracaoBruta <= 2195.12){
			return objPessoa.descontoINSS = (objPessoa.remuneracaoBruta * 9) / 100;
		}else if(objPessoa.remuneracaoBruta >= 2195.13 && objPessoa.remuneracaoBruta <= 4390.24){
			return objPessoa.descontoINSS = (objPessoa.remuneracaoBruta * 11) / 100;
		}else{
			return objPessoa.descontoINSS = 482.93; 
		}
	}

	double calcudaDeducao(Pessoa objPessoa){
		if(objPessoa.idade >= 65){			
			return objPessoa.remuneracaoDeduzida = (objPessoa.remuneracaoBruta - objPessoa.descontoINSS - (objPessoa.nDependentes*179.71) - objPessoa.valorPencao - 1710.78);
		}else{
			return objPessoa.remuneracaoDeduzida = (objPessoa.remuneracaoBruta - objPessoa.descontoINSS - (objPessoa.nDependentes*179.71) - objPessoa.valorPencao);
		}
	}
	
	double calcularIR(Pessoa objPessoa){
		if(objPessoa.remuneracaoDeduzida <= 1787.77){
			objPessoa.valorIR = 0;
			return objPessoa.remuneracaoLiquida = objPessoa.remuneracaoBruta - objPessoa.descontoINSS;
		}else if(objPessoa.remuneracaoDeduzida >= 1787.78 && objPessoa.remuneracaoDeduzida <= 2679.29){
			objPessoa.valorIR = (objPessoa.remuneracaoDeduzida * 7.5/100) - 134.08;
			return objPessoa.remuneracaoLiquida = objPessoa.remuneracaoBruta - objPessoa.descontoINSS - objPessoa.valorIR;
		}else if(objPessoa.remuneracaoDeduzida >= 2679.30 && objPessoa.remuneracaoDeduzida <= 3572.43){
			objPessoa.valorIR = (objPessoa.remuneracaoDeduzida * 15/100) - 335.03;
			return objPessoa.remuneracaoLiquida = objPessoa.remuneracaoBruta - objPessoa.descontoINSS - objPessoa.valorIR;
		}else if(objPessoa.remuneracaoDeduzida >= 3572.44 && objPessoa.remuneracaoDeduzida <= 4463.81){
			objPessoa.valorIR = (objPessoa.remuneracaoDeduzida * 22.5/100) - 602.96;
			return objPessoa.remuneracaoLiquida = objPessoa.remuneracaoBruta - objPessoa.descontoINSS - objPessoa.valorIR;
		}else{
			objPessoa.valorIR = (objPessoa.remuneracaoDeduzida * 27.5/100) - 826.15;
			return objPessoa.remuneracaoLiquida = objPessoa.remuneracaoBruta - objPessoa.descontoINSS - objPessoa.valorIR;
		}
	}
}
