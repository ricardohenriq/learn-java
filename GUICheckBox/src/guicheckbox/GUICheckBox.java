package guicheckbox;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUICheckBox extends JFrame{
    
    JTextField texto = new JTextField("Veja a fonte mudar",12);
    JCheckBox checkBold = new JCheckBox("BOLD");
    JCheckBox checkItalic = new JCheckBox("ITALIC");
    
    class ListenerBoldIatalic implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent ie) {
            if(checkBold.isSelected() && checkItalic.isSelected()){
                texto.setFont(new Font(Font.SERIF,Font.BOLD | Font.ITALIC, 26));
            }else if(checkBold.isSelected()){
                texto.setFont(new Font(Font.SERIF,Font.BOLD, 26));
            }else if(checkItalic.isSelected()){
                texto.setFont(new Font(Font.SERIF,Font.ITALIC, 26));
            }else{
                texto.setFont(new Font(Font.SERIF,Font.PLAIN, 26));
            } 
        }
        
    }
        
    public GUICheckBox(){
        super();
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        texto.setFont(new Font(Font.SERIF,Font.PLAIN,26));
        checkBold.addItemListener(new ListenerBoldIatalic());
        checkItalic.addItemListener(new ListenerBoldIatalic());
        c.add(texto);
        c.add(checkBold);
        c.add(checkItalic);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUICheckBox();
    }
}
