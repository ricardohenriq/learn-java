package classesinterfacesaninhadas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClassesInterfacesAninhadas extends JFrame{
    
    JButton botao;
    JButton botao2;
    
    public class BotaoActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Classe Aninhada executa "+botao.getText());
        }
        
    }
    
    public ClassesInterfacesAninhadas(){
        
        super("ClassesInterfacesAninhadas");
        Container c = getContentPane();
        botao = new JButton("OK");
        botao2 = new JButton("CANCEL");
        botao.addActionListener(new BotaoActionListener());
        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Classe Anonima executa "+botao2.getText());
            }
        });
        
        c.add(BorderLayout.NORTH,botao);  
        c.add(BorderLayout.SOUTH,botao2); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ClassesInterfacesAninhadas janela = new ClassesInterfacesAninhadas();
        //SE EU QUISESE UMA INSTANCIA DA CLASSE ANINHADA
        //ClassesInterfacesAninhadas.BotaoActionListener listener = janela.new BotaoActionListener();
    }
}
