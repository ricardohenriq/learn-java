package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServidor {
      
    public ChatServidor() throws IOException{
        ServerSocket servidor;
        try{
            servidor = new ServerSocket(5000);
            while(true){
                Socket socket = servidor.accept();
                new Thread(new EscutaCliente(socket)).start();
            }
        }catch(Exception e){
            
        }
    }
    
    private class EscutaCliente implements Runnable{
        
        Scanner leitor;
        
        public EscutaCliente(Socket socket) throws IOException{
            try{
                leitor = new Scanner(socket.getInputStream());
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        
        @Override
        public void run() {
            try{
                String texto;
                while((texto = leitor.nextLine()) != null){
                    System.out.println(texto);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        new ChatServidor();
    }
}
