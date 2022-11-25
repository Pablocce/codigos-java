import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class interfaz extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menu1,menu2,menu3,menu4;
	private JMenuItem m1,m2,m3,m4;
	public interfaz() {
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu1 = new JMenu("Opciones");
		mb.add(menu1);
		menu2 = new JMenu("Tamaño de la ventana");
		menu1.add(menu2);
		menu3 = new JMenu("Color de fondo");
		menu1.add(menu3);
		
		m1 = new JMenuItem("640*480");
		m1.addActionListener(this);
		menu1.add(m1);
		
		m2 =new JMenuItem("120*300");
		m2.addActionListener(this);
		menu2.add(m2);
		
		m3 = new JMenuItem("Verde");
		m3.addActionListener(this);
		menu3.add(m3);
		
		m4 = new JMenuItem("Cyan");
		m4.addActionListener(this);
		menu3.add(m4);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==m1) {
			setSize(640,480);
		}
		
		if(e.getSource()==m2) {
			setSize(1024,748);
		}
		if(e.getSource()==m3) {
			getContentPane().setBackground(new Color(255,0,0));
		}
		if(e.getSource()==m4) {
			getContentPane().setBackground(new Color(0,255,0));
		}
	}
	public static void mian(String []ar ) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,300,200);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
