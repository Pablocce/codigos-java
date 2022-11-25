import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Laberinto extends JFrame implements
ActionListener{
	JLabel[][] I;
	JButton b1;
	JButton b2;
	boolean salida;
	Laberinto(){
		setLayout(null);
		I=new JLabel[10][10];
		for(int f=0;f<10;f++) {
			for(int c=0;c<10;c++){
				I[f][c]=new JLabel();
				I[f][c].setBounds(20+c*20,50+f*20,20,20);
				add(I[f][c]);
			}
		}
	b1=new JButton("Recorrer");
		b1.setBounds(10,300,100,25);
		add(b1);
		b1.addActionListener(this);
	b2=new JButton("Crear");
		b2.setBounds(120,300,100,25);
		add(b2);
		b2.addActionListener(this);
		crear();
	}
	public void crear() {
		for(int f=0;f<10;f++) {
			for(int c = 0;c<10;c++) {
				int a = (int)(Math.random()*4);
				I[f][c].setForeground(Color.black);
				if (a==0) {
					I[f][c].setText("1");
				}else {
					I[f][c].setText("0");
				}
			}
			I[9][9].setText("S");
			I[0][0].setText("O");
		}
	}
	public void recorrer(int fil, int col) {
		if (fil>=0 && fil<10 && col>=0 && col<10 && salida==false) {
			if(I[fil][col].getText().equals("s")) {
				salida=true;
			}else {
				if(I[fil][col].getText().equals("O")) {
					I[fil][col].setText("9");
					I[fil][col].setForeground(Color.red);
					recorrer(fil,col+1);
					recorrer(fil+1,col);
					recorrer(fil-1,col);
					recorrer(fil,col-1);
				}
			}
		}
	}
}

