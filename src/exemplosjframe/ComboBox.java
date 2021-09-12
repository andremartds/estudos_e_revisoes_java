package exemplosjframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
public class ComboBox extends JFrame implements ItemListener{
	JComboBox<String> combo;
	JLabel img;
	ImageIcon[]imagens = {
			new ImageIcon(getClass().getResource("imagens/android.png")),
			new ImageIcon(getClass().getResource("imagens/checklist.png")),
			new ImageIcon(getClass().getResource("imagens/chrome.png")),
			new ImageIcon(getClass().getResource("imagens/confirm.png")),
			new ImageIcon(getClass().getResource("imagens/contacts.png")),
			new ImageIcon(getClass().getResource("imagens/grafico.png")),
			new ImageIcon(getClass().getResource("imagens/help.png")),
			new ImageIcon(getClass().getResource("imagens/Icon.png")),
			new ImageIcon(getClass().getResource("imagens/musics.png")),
			new ImageIcon(getClass().getResource("imagens/power.png")),
			new ImageIcon(getClass().getResource("imagens/setting.png")),
			new ImageIcon(getClass().getResource("imagens/Transmission_icon.png")),
			new ImageIcon(getClass().getResource("imagens/trash.png")),
			new ImageIcon(getClass().getResource("imagens/txt.png")),
			
			
	};
	ComboBox(){
		super("imagens no combo");
		Container c = getContentPane();
		combo = new JComboBox<String>();
		combo.addItem("Android");
		combo.addItem("checklist");
		combo.addItem("chrome");
		combo.addItem("confirm");
		combo.addItem("Contacts");
		combo.addItem("grafico");
		combo.addItem("help");
		combo.addItem("Icon");
		combo.addItem("musics");
		combo.addItem("power");
		combo.addItem("setting");
		combo.addItem("transmission_icon");
		combo.addItem("trash");
		combo.addItem("Txt");
		combo.addItem("Navegador");
		
		combo.addItemListener(this);
		
		
		img = new JLabel(imagens[0]);
		
		c.add(combo);
		c.add(img);
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER,img);
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
	}

	public static void main(String[] args) {
		new ComboBox();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			img.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}

}

