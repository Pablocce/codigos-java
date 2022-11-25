import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
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
		setBounds(100, 100, 670, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(194, 251, 103, 13);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bebida A");
		rdbtnNewRadioButton.setBounds(6, 73, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Bebida B");
		rdbtnNewRadioButton_1.setBounds(6, 117, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Bebida C");
		rdbtnNewRadioButton_2.setBounds(6, 160, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Euros");
		lblNewLabel.setBounds(242, 77, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblCentimos = new JLabel("Centimos");
		lblCentimos.setBounds(242, 121, 45, 13);
		contentPane.add(lblCentimos);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(359, 73, 74, 21);
		contentPane.add(comboBox);
		comboBox.addItem("0");
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(359, 117, 74, 21);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("0");
		comboBox_1.addItem("10");
		comboBox_1.addItem("20");
		comboBox_1.addItem("50");
		comboBox_1.addItem("80");
		
		
		JButton btnNewButton = new JButton("Extraer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton  ) {
					String cad1 = (String)comboBox.getSelectedItem();
					String cad2 = (String)comboBox_1.getSelectedItem();
					int euros = Integer.parseInt(cad1);
					int centimos = Integer.parseInt(cad2);
					if(euros==0 && centimos==80 && rdbtnNewRadioButton.isSelected()) {
						lblNewLabel_1.setText("Correcto");
					}else {
						if(euros==1 && centimos==20) {
							lblNewLabel_1.setText("Correcto");
						}else {
							if(euros==3 && centimos==10) {
								lblNewLabel_1.setText("Correcto");
							}else {
								lblNewLabel_1.setText("Error");
							}
						}
					}
				
				}
			}
		});
		btnNewButton.setBounds(24, 247, 85, 21);
		contentPane.add(btnNewButton);
		
	}
}
