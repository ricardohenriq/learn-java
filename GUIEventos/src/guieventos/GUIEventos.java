package guieventos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEventos extends JFrame implements ActionListener{
    
    JButton botao;
    
    public GUIEventos(){
        super("Layouts 2");
        
        botao = new JButton("Clique Aqui");
        //IRA COLOCAR ESTA CLASSE COMO TRATADORA DESTE EVENTO
        botao.addActionListener(this);
        Container c = getContentPane();
        c.add(botao);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
        
    }
    
    public static void main(String[] args) {
        new GUIEventos();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        botao.setText("Clicou");
    }
}
