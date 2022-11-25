package basededatos;

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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class basesdedatos extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JLabel labelResultado;
	private JButton btnConsultaPorCdigo;
	private JLabel lblingreseCdigoDe;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					basesdedatos frame = new basesdedatos();
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
	public basesdedatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcinDelArtculo = new JLabel("Descripcion del articulo");
		lblDescripcinDelArtculo.setBounds(23,38,193,14);
		contentPane.add(lblDescripcinDelArtculo);
		
		tf1 = new JTextField();
		tf1.setBounds(247,35,193,20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(23,74,95,14);
		contentPane.add(lblPrecio);
		
		tf2 = new JTextField();
		tf2.setBounds(247,71,107,20);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText("");
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
					Statement comando=conexion.createStatement();
					comando.executeUpdate("insert into articulos(descripcion,precio) values ('"+tf1.getText()+"',"+tf2.getText()+")");
					conexion.close();
					tf1.setText("");
					tf2.setText("");
				}catch(SQLException ex) {
					setTitle(ex.toString());
				}
			}
		});
		
		btnAlta.setBounds(247,118,89,23);
		contentPane.add(btnAlta);
		
		labelResultado = new JLabel("resultado");
		labelResultado.setBounds(361,122,229,14);
	}

}
