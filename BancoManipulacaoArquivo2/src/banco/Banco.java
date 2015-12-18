package banco;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Banco {
    /* ANTES DE APRENDER SERIALIZACAO
    private Path caminho = Paths.get("C:/Users/Ricardo/Downloads/Teste/Contas.txt");
    private Charset utf8 = StandardCharsets.UTF_8;
   */    
    public void armazenar(ArrayList<ClasseConta> listaContas) throws IOException{
        
        FileOutputStream fos = new FileOutputStream("C:/Users/Ricardo/Downloads/Teste/ContaSerializada.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listaContas);
        oos.close();
        
        /* ANTES DE APRENDER SERIALIZACAO
        //CRIAR, ESCREVER
        try(BufferedWriter w = Files.newBufferedWriter(caminho, utf8)){
            for(ClasseConta conta : listaContas){
                w.write(conta.getNome()+";"+conta.getSaldo()+"\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }*/        
    }
    
    public ArrayList<ClasseConta> recuperar()throws IOException, ClassNotFoundException{
        
        FileInputStream fis = new FileInputStream("C:/Users/Ricardo/Downloads/Teste/ContaSerializada.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<ClasseConta> listaConta2= (ArrayList<ClasseConta>) ois.readObject();
        
        /* ANTES DE APRENDER SERIALIZACAO
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
        }*/        
        return listaConta2;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        ArrayList<ClasseConta> listaContas = new ArrayList();
        listaContas.add(new ClasseConta("Ricardo",5000.00));
        listaContas.add(new ClasseConta("Henrique",4000.00));
        listaContas.add(new ClasseConta("Inacio",9000.00));
        
        Banco bancoArquivos = new Banco();          
        bancoArquivos.armazenar(listaContas);
        ArrayList<ClasseConta>listaConta2 = bancoArquivos.recuperar();
        
        for(ClasseConta conta : listaConta2){
            System.out.println(conta.getNome()+" "+conta.getSaldo());
        }
    }
}
