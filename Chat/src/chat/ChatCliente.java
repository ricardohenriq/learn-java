package chat;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ChatCliente extends JFrame{

    JTextField textoParaEnviar;
    JButton botaoEnviar;
    Socket socket;
    PrintWriter escritor;
    String nome;
    
    public ChatCliente(String nome) throws UnknownHostException, IOException{
        super("Chat : "+nome);
        this.nome = nome;
        
        Container c = getContentPane();
        
        Font fonte = new Font(Font.SERIF,Font.PLAIN,26);
        
        textoParaEnviar = new JTextField();
        textoParaEnviar.setFont(fonte);
        botaoEnviar = new JButton("Enviar");
        botaoEnviar.setFont(fonte);
        botaoEnviar.addActionListener(new botaoEnviarListener());
        c.add(BorderLayout.EAST,botaoEnviar);
        c.add(BorderLayout.CENTER,textoParaEnviar);
        
        configurarRede();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,90);
        setVisible(true);
    }
   
    public class botaoEnviarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            escritor.println(nome+" : "+textoParaEnviar.getText());
            //PARA GARANTIR QUE A MENSSAGEM FOI ENVIADO COM SUCESSO
            escritor.flush();
            textoParaEnviar.setText("");
            textoParaEnviar.requestFocus();
        }  
    }
    
    private void configurarRede() throws UnknownHostException, IOException{
        try{
            socket = new Socket("127.0.0.1",5000);
            //PARA PODERMOS ENVIAR INFORMACOES AO SERVIDOR 
            //A CLASSE PrintWriter FACILITA A MANIPULACAO DO
            //OutputStream, ELA REPRESENTA UM ESCRITOR DE INFORMACOES
            //DO NOSSO CLIENTE LA NO SERVIDOR
            escritor = new PrintWriter(socket.getOutputStream());
        }catch(Exception e){
            e.printStackTrace();
        }
 
    }
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        new ChatCliente("Ricardo");
        new ChatCliente("Henrique");
    }
}
