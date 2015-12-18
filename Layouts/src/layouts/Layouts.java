package layouts;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame{
    
    public Layouts(){
        super("Layouts");
        
        Container c = getContentPane();
        /*
         *BorderLayout border = new BorderLayout();
         *c.setLayout(border);
         */        
        c.add(BorderLayout.NORTH, new JButton("Botao 1"));
        c.add(BorderLayout.SOUTH, new JButton("Botao 2"));
        c.add(BorderLayout.CENTER, new JButton("Botao 3"));
        c.add(BorderLayout.EAST, new JButton("Botao 4"));
        c.add(BorderLayout.WEST, new JButton("Botao 5"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Layouts();
    }
}
