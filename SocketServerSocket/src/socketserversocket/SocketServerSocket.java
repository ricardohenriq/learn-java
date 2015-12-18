package socketserversocket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketServerSocket {

    public static void main(String[] args) throws UnknownHostException, IOException {
        //ESTA E A CLASSE "CLIENTE"
        //IRA RECEBER CONSELHOS DO SERVIDOR
        //PORTAS 0 - 1023 NAO DEVEM SER USADAS
        //JA QUE ESTAO RESERVADAS A SERVICOS COMO
        //SERVIDOR HTTP PORTA 80, SMTP PORTA 25
        Socket socket = new Socket("127.0.0.1", 5000);
        Scanner s = new Scanner(socket.getInputStream());
        System.out.println(s.nextLine());
        s.close();
    }
}
