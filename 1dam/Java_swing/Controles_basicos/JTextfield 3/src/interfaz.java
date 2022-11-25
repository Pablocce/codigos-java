import javax.swing.*;
import java.awt.event.*;

public class interfaz extends JFrame implements ActionListener {
	private JTextField textfield1,textfield2;
	private JButton boton1;
	private JLabel label1,label2;
	public interfaz() {
		setLayout(null);
		
		label1 = new JLabel("Nombre");
		label1.setBounds(10,10,100,30);
		add(label1);
		
		textfield1=new JTextField();
		textfield1.setBounds(120,10,100,30);
		add(textfield1);
		
		label2 = new JLabel("Contraseña");
		label2.setBounds(10,50,100,30);
		add(label2);
		
		textfield2=new JTextField();
		textfield2.setBounds(120,50,100,30);
		add(textfield2);
		
		boton1= new JButton("Aceptar");
		boton1.setBounds(10,90,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			String cad1=textfield1.getText();
			String cad2=textfield2.getText();
			if (cad1.equals("juan")&& cad2.equals("abc123") ) {
				setTitle("Correcto");
			}
			
		}
	}
	
	public static void main(String[] ar) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,500,400);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}