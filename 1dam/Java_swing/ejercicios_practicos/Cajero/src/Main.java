import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private int monto= 3000;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dinero a extraer");
		lblNewLabel.setBounds(10, 35, 88, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de cuenta");
		lblTipoDeCuenta.setBounds(235, 35, 88, 13);
		contentPane.add(lblTipoDeCuenta);
		
		JComboBox <Integer>comboBox = new JComboBox<Integer>();
		comboBox.setBounds(20, 58, 106, 21);
		contentPane.add(comboBox);
		comboBox.addItem(10);
		comboBox.addItem(20);
		comboBox.addItem(40);
		comboBox.addItem(50);
		comboBox.addItem(100);
		comboBox.addItem(150);
		comboBox.addItem(200);
		comboBox.addItem(300);
		comboBox.addItem(400);
		comboBox.addItem(500);
		
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(245, 58, 106, 21);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("Caja de ahorro");
		comboBox_1.addItem("Cuenta corriente");
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(258, 245, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Extraer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cad1 = (String)comboBox_1.getSelectedItem();
				int euros = Integer.parseInt(cad1);
				if(comboBox.equals("Caja de ahorro") && euros<=200) {
					monto = monto - euros;
					lblNewLabel_1.setText("Monto actual:" + monto);
				}else {
					if(comboBox.equals("Caja de ahorro") && euros>200) {
						lblNewLabel_1.setText("Monto actual:" + monto);
					}
				if (comboBox.equals("Cuenta corriente")&&euros<=500) {
					monto = monto - euros;
					lblNewLabel_1.setText("Monto actual:" + monto);
					}else {
						if (comboBox.equals("Cuenta corriente")&&euros>500) {
							lblNewLabel_1.setText("Monto actual:" + monto);
					}
					}
					
				}
			}
		});
		btnNewButton.setBounds(13, 241, 85, 21);
		contentPane.add(btnNewButton);
		

	}
}
