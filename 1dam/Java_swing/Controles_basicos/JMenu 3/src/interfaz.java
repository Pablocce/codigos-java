import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
public class interfaz extends JFrame implements ActionListener {
	private JTextField textfield1,textfield2;
	private JMenuBar mb;
	private JMenu menu1,menu2;
	private JMenuItem m1,m2;
	
	public interfaz() {
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu1 = new JMenu("Opciones");
		mb.add(menu1);
		m1 = new JMenuItem("Redimensionar ventana");
		m1.addActionListener(this);
		menu1.add(m1);
		m2 = new JMenuItem("Salir");
		m2.addActionListener(this);
		menu1.add(m2);
		
	
		
		textfield1= new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
		
		textfield2= new JTextField();
		textfield2.setBounds(10,50,200,30);
		add(textfield2);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==m1) {
			String cad1 = textfield1.getText();
			String cad2 = textfield2.getText();
			int ancho = Integer.parseInt(cad1);
			int largo = Integer.parseInt(cad2);
			setSize(ancho,largo);
		}
		if (e.getSource()==m2) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,300,200);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
