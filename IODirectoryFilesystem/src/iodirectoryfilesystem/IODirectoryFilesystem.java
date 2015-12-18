package iodirectoryfilesystem;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IODirectoryFilesystem {

    public static void main(String[] args) throws IOException {
        
        Iterable<Path> diretorios = FileSystems.getDefault().getRootDirectories();
        for(Path caminho : diretorios){
            System.out.println(caminho);
        }
        //LISTAR CONTEUDO DE UM DIRETORIO
        Path diretorio = Paths.get("C:/Users/Ricardo/Downloads/Teste");
        try(DirectoryStream<Path> streamDiretorios = Files.newDirectoryStream(diretorio)){
            for(Path caminho : streamDiretorios){
                System.out.println(caminho);
                System.out.println(caminho.getFileName());
            }
        }catch(IOException | DirectoryIteratorException e){
            e.printStackTrace();
        }
        
        FileSystem fs = FileSystems.getDefault();
        for(FileStore store : fs.getFileStores() ){
            System.out.println("Unidade "+store.toString());
            System.out.println("Espaco Total "+store.getTotalSpace());
            System.out.println("Espaco Disponivel "+store.getUnallocatedSpace());
            System.out.println("Espaco Usavel "+store.getUsableSpace());
        }
    }
}
