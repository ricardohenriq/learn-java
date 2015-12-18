package guicalculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUICalculadora extends JFrame{

    public GUICalculadora(){
        super("Calculadora");
        
        Container c = getContentPane();
        
        JTextField display = new JTextField();
        display.setFont(new Font(Font.SERIF,Font.PLAIN,26));
        c.add(BorderLayout.NORTH,display);
        
        Container d = new JPanel();
        d.setLayout(new GridLayout(4,4,8,8));
        d.add(new JButton("7"));
        d.add(new JButton("8"));
        d.add(new JButton("9"));
        d.add(new JButton("/"));
        d.add(new JButton("4"));
        d.add(new JButton("5"));
        d.add(new JButton("6"));
        d.add(new JButton("*"));
        d.add(new JButton("1"));
        d.add(new JButton("2"));
        d.add(new JButton("3"));
        d.add(new JButton("-"));
        d.add(new JButton("0"));
        d.add(new JButton("."));
        d.add(new JButton("="));
        d.add(new JButton("+"));
        
        c.add(BorderLayout.CENTER,d);       
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUICalculadora();
    }
}
