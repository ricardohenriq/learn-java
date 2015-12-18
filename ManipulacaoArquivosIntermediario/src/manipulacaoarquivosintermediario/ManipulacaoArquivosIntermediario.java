/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaoarquivosintermediario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Ricardo
 */
public class ManipulacaoArquivosIntermediario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
         Path caminho = Paths.get("C:/Users/Ricardo/Downloads/Teste/Arquivo2.txt");
         //CRIAR, ESCREVER
         Charset utf8 = StandardCharsets.UTF_8;
         BufferedWriter w = null;//ASSIM ATE ANTES DO JAVA 7
         try{//APARTIR DO JAVA 7 try(BufferedWriter w = Files.newBufferedWriter(caminho, utf8))
            //IRA MANTER O ARQUIVO ABERTO PARA QUE POSSA SER
            //ESCRITO CONTINUAMENTE
            w = Files.newBufferedWriter(caminho, utf8);//ASSIM ATE ANTES DO JAVA 7
            w.write("Teste");
            w.write("TESTE");
            //w.flush();//LINHA DESNECESSARIA APARTIR DO JAVA 7
            //O close O FAZ, MAS SE ESTIVER COM MB, GB E BOM USAR
            //DE TEMPOS EM TEMPOS.
         }catch(IOException e){
             e.printStackTrace();
         }finally{
             //APARTIR DO JAVA 7 TODA CLASSE QUE IMPLEMENTA A CLASSE Closeable
             //FECHA AUTOMATICAMENTE DESDE QUE VOCE COLEQUE ELE SENDO INICIALIZADO
             //DENTRO DO PARENTESES DO TRY (//COMENTADO), TAMBEM NAO E NECESSARIO
             // METODO flush JA QUE O close O FAZ.
             if(w != null){
                 w.close();
             }  
         }
         
         //LEITURA
         try(BufferedReader r = Files.newBufferedReader(caminho, utf8)){
             String linha = null;
             while((linha = r.readLine()) != null){
                 System.out.println(linha);
             }
         }
    }
}
