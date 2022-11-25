import javax.swing.*;
import java.awt.event.*;
public class interfaz extends JFrame implements ActionListener {
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	private JButton boton1;
	public interfaz() {
		setLayout(null);
		textarea1=new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,10,300,200);
		add(scrollpane1);
		boton1=new JButton("Verificar");
		boton1.setBounds(10,260,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			String texto =textarea1.getText();
			if (texto.indexOf("java")!=-1) {
				setTitle("Si contiene la palabra java");
			}else {
				setTitle("No contiene");
			}
		}
	}
	public static void main(String[] ar) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,400,300);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
