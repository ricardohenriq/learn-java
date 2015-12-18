package testesuitejunit;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Recursividade {

    public static int soma(int x){
        if(x == 0){
            return x;
        }else{
            return x + soma(x -1);
        }
    }
    
    public static void listar(Path caminho){
        if(Files.isRegularFile(caminho)){
            System.out.println(caminho.toAbsolutePath());
        }else{
            System.err.println(caminho.toAbsolutePath());
            try(DirectoryStream<Path> stream = Files.newDirectoryStream(caminho)){
                for(Path subCaminho : stream){
                    listar(subCaminho);
                }
            } catch (IOException ex) {
                //VAZIO
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("A soma 5 a 0 e = "+soma(10));
        listar(Paths.get("C:/Users/Ricardo/Downloads/teste"));
    }
}
