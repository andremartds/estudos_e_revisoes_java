package exemplosjframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SuppressWarnings("serial")
public class EditorTexto extends JFrame implements ActionListener{
	JTextArea editor;
	JScrollPane barra;
	JButton abrir, sair;
	EditorTexto(){
		super("Edtor de Textos drem");
		sair = new JButton("Sair");
		editor = new JTextArea();
		barra = new JScrollPane(editor);
		abrir = new JButton("Abrir arquivo");
		abrir.addActionListener(this);
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, barra);
		c.add(BorderLayout.NORTH,abrir);
		c.add(BorderLayout.SOUTH,sair);
		setSize(850,430);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		/*Caixa para escolher arquivos */
		JFileChooser c = new JFileChooser();
		
		/*abre o arquivo selecionado dessa janela */
		c.showOpenDialog(this);
		
		/*Pega os dados do arquivo em quest�o*/
		File file = c.getSelectedFile();
		
		try{
			/*Pega o caminho absoluto do arquivo */
			Path path = Paths.get(file.getAbsolutePath());
			/*Pega o retorno dos bytes e coloca dentro de uma string */
			String bytes  = new String(Files.readAllBytes(path));
			/*Redefine o texto com aquele texto em quest�o */
			editor.setText(bytes);
		}catch(Exception e1){
			JOptionPane.showConfirmDialog(this,"Falhou");
			
		}
		
	}
	public static void main(String[] args) {
		new EditorTexto();

	}

}
