package controle2;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Controle2 extends JFrame implements ActionListener{
    
    JLabel botaoLogin = new JLabel("Login: ");
    JTextField digitarLogin = new JTextField();
    JLabel botaoSenha = new JLabel("Senha: ");
    JPasswordField digitarSenha = new JPasswordField();
    JButton botaoOk = new JButton("OK");
    JButton botaoCancel = new JButton("Cancel");
    
    public Controle2(){
        super("Textos e Senha");
        botaoOk.addActionListener(new BotaoOkListener());
        botaoCancel.addActionListener(new BotaoCancelListener());
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2));
        c.add(botaoLogin);
        c.add(digitarLogin);
        c.add(botaoSenha);
        c.add(digitarSenha);
        c.add(botaoOk);
        c.add(botaoCancel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Controle2();        
    }

    //Inner Class /CLASSE INTERNA
    class BotaoOkListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Clicou Ok");
            System.out.println("Login: "+digitarLogin.getText());
            System.out.println("Senha: "+new String(digitarSenha.getPassword()));
        }
        
    }
    
    class BotaoCancelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Clicou Cancel");
            digitarLogin.setText(null);
            digitarSenha.setText(null);
        }
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        /* GEITO ANTIGO E INADEQUADO
        if(ae.getSource() == botaoOk){
            System.out.println("Clicou Ok");
            System.out.println("Login: "+digitarLogin.getText());
            System.out.println("Senha: "+new String(digitarSenha.getPassword()));
        }else if(ae.getSource() == botaoCancel){
            System.out.println("Clicou Cancel");
            digitarLogin.setText(null);
            digitarSenha.setText(null);
        }
        */
    }
}
