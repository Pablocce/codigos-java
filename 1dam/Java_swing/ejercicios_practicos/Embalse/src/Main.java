import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 737, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 250, 1));
		spinner.setBounds(34, 41, 91, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel = new JLabel("Compuerta 1");
		lblNewLabel.setBounds(164, 44, 91, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblCompuerta = new JLabel("Compuerta 2");
		lblCompuerta.setBounds(164, 92, 91, 13);
		contentPane.add(lblCompuerta);
		
		JLabel lblCompuerta_1 = new JLabel("Compuerta 3");
		lblCompuerta_1.setBounds(164, 147, 91, 13);
		contentPane.add(lblCompuerta_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 250, 1));
		spinner_1.setBounds(34, 89, 91, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 250, 1));
		spinner_2.setBounds(34, 144, 91, 20);
		contentPane.add(spinner_2);
		
		JLabel lblNewLabel_1 = new JLabel("Caudal actual:");
		lblNewLabel_1.setBounds(348, 44, 128, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Actualizar caudal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int suma;
				int valor1 = Integer.parseInt(spinner.getValue().toString());
				int valor2 = Integer.parseInt(spinner_1.getValue().toString());
				int valor3 = Integer.parseInt(spinner_2.getValue().toString());
				if (valor1+valor2+valor3<100) {
					lblNewLabel_1.setText("Caudal actual: Bajo");
					
				}else {
					if(valor1+valor2+valor3<200) {
						lblNewLabel_1.setText("Caudal actual: Medio");
						
					}else {
						lblNewLabel_1.setText("Caudal actual: Alto");
						
					}
				}
				
			}
		});
		btnNewButton.setBounds(585, 422, 128, 21);
		contentPane.add(btnNewButton);
		
		
	}
}
