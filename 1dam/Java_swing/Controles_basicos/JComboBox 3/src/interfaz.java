import javax.swing.*;
import java.awt.event.*;
public class interfaz extends JFrame implements ActionListener{
	private JTextField textfield1;
	private JLabel label1;
	private JComboBox<String> combo1;
	private JButton boton;
	
	public interfaz() {
		setLayout(null);
		label1 = new JLabel("Nombre: ");
		label1.setBounds(10,10,100,30);
		add(label1);
		textfield1 = new JTextField();
		textfield1.setBounds(80,10,100,30);
		add(textfield1);
		
		combo1 = new JComboBox();
		combo1.setBounds(200,10,100,30);
		combo1.addItem("España");
		combo1.addItem("Alemania");
		combo1.addItem("Andorra");
		add(combo1);
		
		boton = new JButton("Aplicar");
		boton.setBounds(10,130,100,30);
		add(boton);
		boton.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource()== boton) {
			String cad1 = (String)combo1.getSelectedItem();
			String cad2 = textfield1.getText();
			setTitle(cad1+ "-" + cad2);
		}
	}

	public static void main(String[] args) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,400,300);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
