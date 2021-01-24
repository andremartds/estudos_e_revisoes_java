package jFrame.fundo;
import java.awt.BorderLayout;  
import java.awt.Dimension;  
import java.awt.Graphics;  
import java.awt.Image;  
import java.net.URL;  
  
import javax.swing.ImageIcon;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
  
public class FundoPrincipal extends JPanel {  
  
    private Image image;  
  
    public FundoPrincipal() {  
        this.iniciaNoConstrutor();  
    }  
  
    protected void iniciaNoConstrutor() {  
        this.image = this.getImage("xadrez.png");  
        this.setLayout(new BorderLayout());  
    }  
  
    public Image getImage(String nomeImagem) {  
        URL imageURL = getClass().getResource(nomeImagem);    
        return new ImageIcon(imageURL).getImage();  
    }  
  
    //para desenhar
    public void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        Dimension dDesktop = this.getSize();  
  
        double width = dDesktop.getWidth();  
        double height = dDesktop.getHeight();  
  
        Image background = new ImageIcon(this.image.getScaledInstance(  
                (int) width, (int) height, 1)).getImage();  
        
        //de fato desenha na tela
        g.drawImage(background, 0, 0, this);  
    }  
  
    public static void main(String[] args) {  
        JFrame frame = new JFrame();  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setContentPane(new FundoPrincipal());  
        frame.setSize(600, 700);  
        frame.setVisible(true);  
    }  
}  