import javax.swing.*;
import java.awt.event.*;
public class interfaz extends JFrame implements ActionListener {
	private JScrollPane scrollpane1, scrollpane2;
	private JTextArea textarea1, textarea2;
	private JButton boton1;
	public interfaz() {
		setLayout(null);
		textarea1=new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,10,200,140);
		add(scrollpane1);
		textarea2=new JTextArea();
		scrollpane2 = new JScrollPane(textarea2);
		scrollpane2.setBounds(220,10,200,140);
		add(scrollpane2);
		boton1=new JButton("Verificar");
		boton1.setBounds(10,260,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			String texto =textarea1.getText();
			String texto2 =textarea2.getText();
			if (texto.indexOf(texto2)!=-1) {
				setTitle("Si contiene la palabra java");
			}else {
				setTitle("No contiene");
			}
		}
	}
	public static void main(String[] ar) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,500,350);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
