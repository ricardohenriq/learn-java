package guijcombobox;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIJComboBox extends JFrame{

    JComboBox<String> combo;
    JLabel label;
    ImageIcon[] imagens = {
        new ImageIcon(getClass().getResource("coin 1.jpg")),
        new ImageIcon(getClass().getResource("coin 2.png")),
        new ImageIcon(getClass().getResource("coin 3.png")),
        new ImageIcon(getClass().getResource("coin 4.jpeg"))
    };
    
    class controleCombo implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent ie) {
            if(ie.getStateChange() == ItemEvent.SELECTED){
                label.setIcon(imagens[combo.getSelectedIndex()]);
            }
        }
        
    }
    
    public GUIJComboBox(){
        super("Album de Fotos");
        
        Container c = getContentPane();
        
        imagens[0] = new ImageIcon(getClass().getResource("coin 1.jpg"));
        imagens[1] = new ImageIcon(getClass().getResource("coin 2.png"));
        imagens[2] = new ImageIcon(getClass().getResource("coin 3.png"));
        imagens[3] = new ImageIcon(getClass().getResource("coin 4.jpeg"));
        combo = new JComboBox();
        label = new JLabel(imagens[0]);
        combo.setFont(new Font(Font.SERIF,Font.PLAIN,26));
        combo.addItem("COIN 1");
        combo.addItem("COIN 2");
        combo.addItem("COIN 3");
        combo.addItem("COIN 4");
        combo.addItemListener(new controleCombo());
        
        c.add(BorderLayout.NORTH,combo);
        c.add(BorderLayout.CENTER,label);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 530);
    }
    
    public static void main(String[] args) {
        new GUIJComboBox();
    }
}
