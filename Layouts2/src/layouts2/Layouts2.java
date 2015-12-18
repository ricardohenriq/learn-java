package layouts2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame{
    
    public Layouts2(){
        super("Layouts 2");
        //RECUPERAR O CONTAINER DESTA JANELA
        Container c = getContentPane();
        //CRIAR UM NOVO LAYOUT
        /*
        c.setLayout(new BorderLayout(15,15));
        c.add(BorderLayout.NORTH, new JButton("N"));
        c.add(BorderLayout.SOUTH, new JButton("S"));
        c.add(BorderLayout.CENTER, new JButton("C"));
        c.add(BorderLayout.EAST, new JButton("E"));
        c.add(BorderLayout.WEST, new JButton("W"));
        */
        /*
        c.setLayout(new GridLayout(2,3));
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));
        */
        
        Container d = new JPanel();
        d.setLayout(new GridLayout(4,1));
        d.add(new JButton("OK"));
        d.add(new JButton("Cancel"));
        d.add(new JButton("Setup..."));
        d.add(new JButton("Help"));
        
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.CENTER,new JButton("CENTRO"));
        c.add(BorderLayout.EAST,d);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
        
    }
    
    public static void main(String[] args) {
        new Layouts2();
    }
}
