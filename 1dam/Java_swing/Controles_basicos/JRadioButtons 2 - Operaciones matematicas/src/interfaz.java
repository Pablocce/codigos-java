import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class interfaz extends JFrame implements ChangeListener,ActionListener{
	private JRadioButton boton1,boton2;
	private JTextField textfield1,textfield2;
	private ButtonGroup bg;
	private JButton operar;
	
	public interfaz() {
		setLayout(null);
		
		textfield1= new JTextField();
		textfield1.setBounds(10,10,100,30);
		add(textfield1);
		
		textfield2= new JTextField();
		textfield2.setBounds(10,50,100,30);
		add(textfield2);
		
		
		
		bg=new ButtonGroup();
		boton1=new JRadioButton("Sumar");
		boton1.setBounds(10,90,100,30);
		boton1.addChangeListener(this);
		add(boton1);
		bg.add(boton1);
		
		boton2 = new JRadioButton("Restar");
		boton2.setBounds(10,120,100,30);
		boton2.addChangeListener(this);
		add(boton2);
		bg.add(boton2);
		
		operar = new JButton("Operar");
		operar.setBounds(10,180,100,30);
		operar.addActionListener(this);
		add(operar);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==operar && boton1.isSelected() ) {
			String cad =textfield1.getText();
			String cad2 = textfield1.getText() ;
			int x1 = Integer.parseInt(cad);
			int x2 = Integer.parseInt(cad2);
			int operado = x1 + x2;
			String operado2 = String.valueOf(operado);
			setTitle(operado2);
			
		}
		if (e.getSource()==operar && boton2.isSelected() ) {
			String cad =textfield1.getText();
			String cad2 = textfield1.getText() ;
			int x1 = Integer.parseInt(cad);
			int x2 = Integer.parseInt(cad2);
			int operado = x1 - x2;
			String operado2 = String.valueOf(operado);
			setTitle(operado2);
			
		}
	}

	public void stateChanged(ChangeEvent e) {
		
	}
	
	public static void main(String[]ar) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,400,400);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
