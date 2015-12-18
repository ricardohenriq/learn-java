package annotations;
//REPRESENTACAO DE CABECALHO PADRAO COMUM

import java.io.Serializable;

/*
 * Instituicao:         Universidade XTI
 * Projeto:             Sistema de Avaliacoes
 * Data da Criacao:     09/01/2014
 * Criador:             Ricardo
 * Revisoes Feitas:     2
 */

@Cabecalho(
    instituicao = "Universidade XTI",
    projeto = "Sistema de Avaliacoes",
    dataCriacao = "09/01/2014",
    criador = "Ricardo",
    revisoesFeitas = 2
)
@errosCorrigidos(
    erros = {"0001","0002"}
)

@SuppressWarnings("seiral")
public class Annotations implements Serializable{

    @SuppressWarnings("unused")
    private int x;
    
    public static void main(String[] args) {
        
    }
    @Deprecated
    public void anotar(){
        
    }
    
    @Override
    public String toString(){
        return null; 
    }
}
