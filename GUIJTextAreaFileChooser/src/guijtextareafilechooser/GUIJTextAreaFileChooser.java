package guijtextareafilechooser;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUIJTextAreaFileChooser extends JFrame implements ActionListener{
    
    JTextArea texto ;
    
    public GUIJTextAreaFileChooser(){
        super("Editor De Texto");
        
        Container c = getContentPane();
        
        texto = new JTextArea();
        texto.setFont(new Font(Font.SERIF,Font.PLAIN,26));
        
        JScrollPane scroll = new JScrollPane(texto);
        c.add(BorderLayout.CENTER,scroll);
        
        JButton botao = new JButton("Abrir Arquivo");
        botao.setFont(new Font(Font.SERIF, Font.PLAIN, 26));
        botao.addActionListener(this);
        c.add(BorderLayout.NORTH,botao);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUIJTextAreaFileChooser();
    }
    
    @Override
        public void actionPerformed(ActionEvent ae) {
            JFileChooser c = new JFileChooser();
            c.showOpenDialog(this);
            File arquivo = c.getSelectedFile();
            
            try{
                Path caminho = Paths.get(arquivo.getAbsolutePath());
                String retorno = new String(Files.readAllBytes(caminho));
                texto.setText(retorno);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Deu Erro");
            }
        }  
}
