import javax.swing.*;
public class interfaz extends JFrame {
	private JTextField textfield1;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	public interfaz() {
		setLayout(null);
		textfield1=new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
		textarea1=new JTextArea();
		scrollpane1=new JScrollPane(textarea1);
		scrollpane1.setBounds(10,50,400,300);
		add(scrollpane1);
		
	}
	public static void main(String[] args) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,540,400);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
