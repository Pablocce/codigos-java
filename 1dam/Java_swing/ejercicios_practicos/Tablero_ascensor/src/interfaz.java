import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
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
	public interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Piso");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(242, 113, 81, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDireccin.setBounds(242, 204, 108, 25);
		contentPane.add(lblDireccin);
		
		JLabel texto_piso = new JLabel("0");
		texto_piso.setBounds(460, 123, 45, 13);
		contentPane.add(texto_piso);
		
		JLabel texto_direcc = new JLabel("New label");
		texto_direcc.setBounds(460, 214, 45, 13);
		contentPane.add(texto_direcc);
		
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnNewButton) {
					int pisoactual = Integer.parseInt(texto_piso.getText());
					if (pisoactual<1) {
						texto_direcc.setText("Sube");
					}else {
						texto_direcc.setText("Baja");
					}
					texto_piso.setText("1");
				}
			}
		});
		
		btnNewButton.setBounds(35, 326, 91, 71);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(texto_piso.getText());
				if (pisoactual<2) {
					texto_direcc.setText("Sube");
				}else {
					texto_direcc.setText("Baja");
				texto_piso.setText("2");
				}
			}
		});
		btnNewButton_1.setBounds(35, 215, 91, 71);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(texto_piso.getText());
				if (pisoactual<3) {
					texto_direcc.setText("Sube");
				}else {
					texto_direcc.setText("Baja");
			}
				texto_piso.setText("3");
			}
		});
		btnNewButton_1_1.setBounds(35, 113, 91, 71);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("4");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(texto_piso.getText());
				if (pisoactual<4) {
					texto_direcc.setText("Sube");
				}else {
					texto_direcc.setText("Baja");
			}
				texto_piso.setText("4");
			}
		});
		btnNewButton_1_1_1.setBounds(35, 10, 91, 71);
		contentPane.add(btnNewButton_1_1_1);
	}
}
