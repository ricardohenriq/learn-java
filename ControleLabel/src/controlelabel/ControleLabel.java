package controlelabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame{

    public ControleLabel(){
        
        super("Controle Label");
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        Font fonte = new Font("serif",Font.BOLD | Font.ITALIC, 28);
        
        JLabel simples = new JLabel("Label 1");
        simples.setToolTipText("Meu ToolTipText");
        simples.setFont(fonte);
        simples.setForeground(Color.BLUE);
        c.add(simples);
        
        ImageIcon imagem = new ImageIcon(getClass().getResource("coin.png"));
        JLabel foto = new JLabel(imagem);
        c.add(foto);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ControleLabel();
    }
}
