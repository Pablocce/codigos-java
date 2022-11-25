import javax.swing.*;
import java.awt.event.*;

public class interfaz extends JFrame implements ActionListener {
	private JButton boton1,boton2;
	public interfaz() {
		setLayout(null);
		boton1= new JButton("varón");
		boton1.setBounds(10,100,90,30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2= new JButton("mujer");
		boton2.setBounds(110,100,90,30);
		add(boton2);
		boton2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			setTitle("varón");
		}
		if(e.getSource()==boton2) {
			setTitle("mujer");
		}
	}
	
	public static void main(String[]ar) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,350,200);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	

}