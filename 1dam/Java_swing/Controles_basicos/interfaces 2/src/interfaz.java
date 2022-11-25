import javax.swing.*;
public class interfaz extends JFrame {
	private JLabel color1, color2, color3;
	
	public interfaz() {
		setLayout(null);
		color1=new JLabel("Rojo");
		color1.setBounds(10,20,300,30);
		add(color1);
		color2= new JLabel("Verde");
		color2.setBounds(10,80,300,30);
		add(color2);
		color3= new JLabel("Azul");
		color3.setBounds(10,140,300,30);
		add(color3);
		
	}
	
	public static void main(String[] args) {
		interfaz interfazcolores = new interfaz();
		interfazcolores.setBounds(0,0,300,300);
		interfazcolores.setResizable(true);
		interfazcolores.setVisible(true);
		interfazcolores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
