import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 25));
		spinner.setBounds(10, 38, 62, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel = new JLabel("Velocidad rat\u00F3n");
		lblNewLabel.setBounds(10, 15, 95, 13);
		contentPane.add(lblNewLabel);
		
		JComboBox<String> comboBox1 = new JComboBox<String>();
		comboBox1.setBounds(212, 37, 149, 21);
		contentPane.add(comboBox1);
		comboBox1.addItem("Izquierda");
		comboBox1.addItem("Derecha");
		
		
		JLabel lblNewLabel_1 = new JLabel("Seleccionar boton");
		lblNewLabel_1.setBounds(228, 15, 133, 13);
		contentPane.add(lblNewLabel_1);
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.setColor(Color.black);
		g.drawRect(250,120,120,120);
		g.fillRect(250,120,120,120);
		g.drawOval(250,120,60,60);
		g.fillOval(250,120,60,60);
		
		
			
		

	
	}
}
