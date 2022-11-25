import javax.swing.*;

public class interfaz1 extends JFrame {
	
	private JLabel label1, label2;
	public interfaz1() {
		setLayout(null);
		label1=new JLabel("Sistema de Facturación");
		label1.setBounds(10,20,300,30);
		add(label1);
		label2= new JLabel("Version 1.0");
		label2.setBounds(10,100,100,30);
		add(label2);
	}
	
	public static void main(String[]ar) {
		interfaz1 interfaces = new interfaz1();
		interfaces.setBounds(0,0,300,200);
		interfaces.setResizable(true);
		interfaces.setVisible(true);
		interfaces.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
