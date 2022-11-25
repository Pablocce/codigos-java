import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class interfaz extends JFrame implements ChangeListener, ActionListener {
	private JCheckBox check1,check2,check3;
	private JButton boton;
	
	
	public interfaz(){
		setLayout(null);
		check1 = new JCheckBox("Chrome");
		check1.setBounds(10,50,100,30);
		check1.addChangeListener(this);
		add(check1);
		
		check2 = new JCheckBox("FireFox");
		check2.setBounds(10,100,100,30);
		check2.addChangeListener(this);
		add(check2);
		
		check3 = new JCheckBox("Opera");
		check3.setBounds(10,150,100,30);
		check3.addChangeListener(this);
		add(check3);
		
		boton= new JButton("Confirmar");
		boton.setBounds(10,200,90,30);
		boton.addActionListener(this);
		add(boton);
	}
	
	public void stateChanged(ChangeEvent e) {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String cad = "";
		if(e.getSource()== boton && check1.isSelected()==true) {
			cad = cad + "Chrome -";
		}
		if(e.getSource()== boton && check1.isSelected()==true) {
			cad = cad + "Firefox -";
		}
		if(e.getSource()== boton && check1.isSelected()==true) {
			cad = cad + "OperaGX ";
		}
		setTitle(cad);
		
	}
	public static void main(String[] args) {
		interfaz interfaz1 = new interfaz();
		interfaz1.setBounds(0,0,400,200);
		interfaz1.setVisible(true);
		interfaz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
