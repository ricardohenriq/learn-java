package banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Banco {
    
    private Path caminho = Paths.get("C:/Users/Ricardo/Downloads/Teste/Contas.txt");
    private Charset utf8 = StandardCharsets.UTF_8;
        
    public void armazenar(ArrayList<ClasseConta> listaContas) throws IOException{
        
        //CRIAR, ESCREVER
        try(BufferedWriter w = Files.newBufferedWriter(caminho, utf8)){
            for(ClasseConta conta : listaContas){
                w.write(conta.getNome()+";"+conta.getSaldo()+"\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    public ArrayList<ClasseConta> recuperar()throws IOException{
        
        ArrayList<ClasseConta> listaConta = new ArrayList();
        //LEITURA
        try(BufferedReader r = Files.newBufferedReader(caminho, utf8)){
            String linha = null;
            while((linha = r.readLine()) != null){
                String[] tokens = linha.split(";");
                listaConta.add(new ClasseConta(tokens[0],Double.parseDouble(tokens[1])));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return listaConta;
    }
    
    public static void main(String[] args) throws IOException{
        
        ArrayList<ClasseConta> listaContas = new ArrayList();
        listaContas.add(new ClasseConta("Ricardo",5000.00));
        listaContas.add(new ClasseConta("Henrique",4000.00));
        listaContas.add(new ClasseConta("Inacio",9000.00));
        
        Banco bancoArquivos = new Banco();          
        bancoArquivos.armazenar(listaContas);
        ArrayList<ClasseConta>listaConta2 = bancoArquivos.recuperar();
        
        for(ClasseConta conta : listaConta2){
            System.out.println(conta.getNome()+conta.getSaldo());
        }
    }
}
