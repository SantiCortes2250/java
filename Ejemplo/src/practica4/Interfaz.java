package practica4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Interfaz extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnDesactivar;
	private JButton btnAceptar;
	private JButton btnActivar;
	private JLabel txtFrase;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtNombre.setBounds(10, 10, 163, 37);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(263, 10, 163, 37);
		contentPane.add(txtCiudad);
		
		txtFrase = new JLabel("");
		txtFrase.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtFrase.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrase.setBounds(10, 82, 416, 37);
		contentPane.add(txtFrase);
		
		btnActivar = new JButton("Activar");
		btnActivar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnActivar.setBounds(10, 161, 134, 37);
		btnActivar.addActionListener(this);
		contentPane.add(btnActivar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDesactivar.setBounds(292, 161, 134, 37);
		btnDesactivar.addActionListener(this);
		contentPane.add(btnDesactivar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAceptar.setBounds(151, 216, 134, 37);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnAceptar) {
			txtFrase.setText("Usted se llama "+txtNombre.getText()+" y vive en "+txtCiudad.getText()+".");
		}
		if (e.getSource()==btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
		}
		if (e.getSource()==btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}
		
	}
}
