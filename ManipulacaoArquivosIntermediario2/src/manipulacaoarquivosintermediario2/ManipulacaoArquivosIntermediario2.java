package manipulacaoarquivosintermediario2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ManipulacaoArquivosIntermediario2 {
    
    public static void main(String[] args) throws IOException {
        
        Path caminho = Paths.get("C:/Users/Ricardo/Downloads/Teste/Arquivo3.txt");
        System.out.println(Files.exists(caminho));
        System.out.println(Files.isDirectory(caminho));
        System.out.println(Files.isRegularFile(caminho));
        System.out.println(Files.isReadable(caminho));
        System.out.println(Files.isExecutable(caminho));
        System.out.println(Files.size(caminho));
        System.out.println(Files.getLastModifiedTime(caminho));
        System.out.println(Files.getOwner(caminho));     
        System.out.println(Files.probeContentType(caminho));
        
        //DELETE
        //Files.delete(caminho);//LANCA 2 EXCECOES
        //Files.deleteIfExists(caminho);//LANCA NEHUMA
        
        //CREATE
        Path caminho2 = Paths.get("C:/Users/Ricardo/Downloads/Teste/Arquivo4.txt");
        Files.createFile(caminho2);
        Files.write(caminho2, "Meu Texto".getBytes());
        //COPY
        Path copia = Paths.get("C:/Users/Ricardo/Downloads/Teste/Arquivo5.txt");
        Files.copy(caminho2, copia, StandardCopyOption.REPLACE_EXISTING);
        
       //MOVE
       Path mover = Paths.get("C:/Users/Ricardo/Downloads/Teste2/Arquivo5.txt");
       Files.createDirectories(mover.getParent());
       Files.move(copia, mover, StandardCopyOption.REPLACE_EXISTING);
    }
}
