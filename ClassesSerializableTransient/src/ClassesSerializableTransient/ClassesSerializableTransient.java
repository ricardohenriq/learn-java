package ClassesSerializableTransient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ClassesSerializableTransient {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        //A SERIALIZACAO DE OBJETOS COMPLEXOS (O MAIS COMUM)
        //COMO OBJETO COMPOSTOS DE OUTROS OBJETOS QUE SAO
        //COMPOSTOS POR OUTROS OBJETOS
        //A SERIALIZACAO SO PODE SER FEITA EM OBJETOS QUE IMPLEMENTAM
        //A INTERFACE Serializable
        //A CLASSE IRA MANIPULAR bytes E NAO caracteres COMO ANTIGAMENTE
        
        String[] nomes = {"Ricardo","Henrique","Bill"};
        ClasseConta conta1 = new ClasseConta("Ricardo",345.67);
        ClasseConta conta2 = new ClasseConta("Henrique",234.56);
        ClasseConta conta3 = new ClasseConta("Bill",123.45);
        
        //ESCRITA DE OBJETO
        //ESSA CLASSE RECEBE COMO PARAMETRO O ENDERECO DO ARQUIVO
        //QUE VAMOS UTILIZAR PARA ESCRITA DO OBJETO
        FileOutputStream fos = new FileOutputStream("C:/Users/Ricardo/Downloads/Teste/TesteSerializacao.ser");
        //ESSA CLASSE UTILIZA UM FileOutputStream PRA REALIZAR AS OPERACOES
        //DE GRAVAR OBJETOS PRA GENTE
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(nomes);
        oos.writeObject(conta1);
        oos.writeObject(conta2);
        oos.close();
        
        //LEITURA DE OBJETO
        FileInputStream fis = new FileInputStream("C:/Users/Ricardo/Downloads/Teste/TesteSerializacao.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String[] nomes2 = (String[])ois.readObject();
        ClasseConta conta11 = (ClasseConta)ois.readObject();
        ClasseConta conta22 = (ClasseConta)ois.readObject();
        ois.close();
        System.out.println(Arrays.toString(nomes2));
        conta11.exibeSaldo();
        conta22.exibeSaldo();
        
        //OBS. SO SAO SERIALIZADAS AS VARIAVEIS DO OBJETO OU SEJA
        //VARIAVEIS QUE SAO DA CLASSE (static) NAO SAO
        //HA POSSIBILIDADE DE VOCE NAO ARMAZENAR UMA VARIAVEL DE 
        //OBJETO USANDO O MODIFICADOR (transient)
    }
}
