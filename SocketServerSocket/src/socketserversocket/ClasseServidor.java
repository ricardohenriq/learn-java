package socketserversocket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClasseServidor {

    public static void main(String[] args) throws IOException {
        
        ServerSocket server = new ServerSocket(5000);
        while(true){
            //server.accept() FICA AGUARDANDO A CHEGADA DE NOVOS
            //CLIENTES E ASSIM QUE CHEGAR IRA RETORNAR UM socket 
            //PRA QUE O SERVIDOR POSSA CONVERSAR COM O CLIENTE
            Socket socket = server.accept();
            try(PrintWriter w = new PrintWriter(socket.getOutputStream())){
                w.println("Aprenda Java");
            }catch(Exception e){
                e.printStackTrace();
            }  
        }
    }
}
