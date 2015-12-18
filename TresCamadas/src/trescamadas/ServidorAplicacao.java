package teste;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorAplicacao {

    public static void main(String args[]) throws Exception {
        ServerSocket server = new ServerSocket(9800);
        DataInputStream in;
        DataOutputStream out;
        int i = 1;
        int maximumConnections = 9999;

        while (true) {
            DatagramSocket asocket = new DatagramSocket();
            asocket.setSoTimeout(10);
            Socket socket = server.accept();
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            int number1 = in.readInt();
            int number2 = in.readInt();
            int result = calcule(number1, number2);
            envieServidor(result);
            i++;
            if (i == maximumConnections) {
                break;
            }
        }
        in.close();
        out.close();
        server.close();
    }

    public static int calcule(int valor1, int valor2) {
        return valor1 * valor2;
    }

    private static void envieServidor(int result) {
        try {
           
            Socket servidorApl = new Socket("localhost",9300);
            DataOutputStream outApl;
            outApl = new DataOutputStream(servidorApl.getOutputStream());
             System.out.println("Enviando para o servidor.");
            outApl.writeInt(result);
        } catch (Exception e) {
            System.out.println("Imprimindo erro envieServidor."+e.getMessage());
        }

    }
}
