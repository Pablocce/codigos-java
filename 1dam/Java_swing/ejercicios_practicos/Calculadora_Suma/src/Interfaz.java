import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce primer valor");
		lblNewLabel.setBounds(10, 55, 115, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblIntroduceSegundoValor = new JLabel("Introduce segundo valor");
		lblIntroduceSegundoValor.setBounds(10, 98, 115, 13);
		contentPane.add(lblIntroduceSegundoValor);
		
		textField = new JTextField();
		textField.setBounds(138, 52, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 95, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Sumar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnNewButton) {
					String cad1 = textField.getText();
					String cad2 = textField_1.getText();
					int x1 = Integer.parseInt(cad1);
					int x2 = Integer.parseInt(cad2);
					int suma = x1 + x2;
					String total = String.valueOf(suma);
					setTitle(total);
					
					
				}
			}
		});
		btnNewButton.setBounds(138, 163, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(256, 167, 45, 13);
		contentPane.add(lblNewLabel_1);
	}
}
