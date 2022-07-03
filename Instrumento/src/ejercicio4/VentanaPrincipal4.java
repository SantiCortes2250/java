package ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class VentanaPrincipal4 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnDesactivar, btnAceptar, btnActivar;
	private JLabel txtFrase;


	public VentanaPrincipal4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(279, 46, 126, 34);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(279, 100, 126, 34);
		contentPane.add(txtCiudad);
		
		txtFrase = new JLabel("");
		txtFrase.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtFrase.setBounds(20, 28, 249, 127);
		contentPane.add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setBackground(Color.BLUE);
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(43, 187, 97, 34);
		contentPane.add(btnAceptar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnDesactivar.setForeground(Color.WHITE);
		btnDesactivar.setBackground(Color.RED);
		btnDesactivar.addActionListener(this);
		btnDesactivar.setBounds(165, 187, 104, 34);
		contentPane.add(btnDesactivar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnActivar.setForeground(Color.WHITE);
		btnActivar.setBackground(Color.GREEN);
		btnActivar.addActionListener(this);
		btnActivar.setBounds(285, 187, 97, 34);
		contentPane.add(btnActivar);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);

		}
		
		if(e.getSource()==btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}
		
		if(e.getSource()==btnAceptar) {
			txtFrase.setText("Usted se llama " +txtNombre.getText()+" y vive en " +txtCiudad.getText());
		}
		
	}

}
