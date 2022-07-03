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

public class Interfaz extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnDesactivar, btnAceptar, btnActivar;
	private JLabel txtFrase;


	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(43, 42, 126, 34);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(239, 42, 126, 34);
		contentPane.add(txtCiudad);
		
		txtFrase = new JLabel("");
		txtFrase.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtFrase.setBounds(53, 94, 324, 82);
		contentPane.add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAceptar.setForeground(new Color(0, 0, 0));
		btnAceptar.setBackground(new Color(128, 128, 128));
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(311, 200, 80, 34);
		contentPane.add(btnAceptar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDesactivar.setForeground(new Color(0, 0, 0));
		btnDesactivar.setBackground(new Color(128, 128, 128));
		btnDesactivar.addActionListener(this);
		btnDesactivar.setBounds(46, 200, 90, 34);
		contentPane.add(btnDesactivar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnActivar.setForeground(new Color(0, 0, 0));
		btnActivar.setBackground(new Color(128, 128, 128));
		btnActivar.addActionListener(this);
		btnActivar.setBounds(184, 200, 80, 34);
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
			txtFrase.setText("Su nombre es " +txtNombre.getText()+" y vive en " +txtCiudad.getText());
		}
		
	}

}
