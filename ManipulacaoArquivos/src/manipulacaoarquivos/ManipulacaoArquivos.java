/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaoarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Ricardo
 */
public class ManipulacaoArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Path caminho = Paths.get("C:/Users/Ricardo/Downloads/Teste/Arquivo.txt");
        System.out.println(caminho.toAbsolutePath());
        System.out.println(caminho.getParent());
        System.out.println(caminho.getRoot());
        System.out.println(caminho.getFileName());
        
        //CRIACAO DE DIRETORIOS
        Files.createDirectories(caminho.getParent());
        
        //CRIAR, ESCREVER E LER ARQUIVOS
        byte[] texto = "TESTE teste teste TESTE".getBytes();
        Files.write(caminho, texto);//ELE CRIA/ABRE, LIMPA, ESCREVE E FECHA O ARQUIVO
        
        byte[] retorno = Files.readAllBytes(caminho);
        System.out.println(new String(retorno));
    }
}
