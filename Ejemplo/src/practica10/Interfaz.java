package practica10;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Interfaz extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JButton btnConcatena;
	private JLabel etiTexto;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtPalabra1.setBounds(10, 10, 188, 42);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(238, 10, 188, 42);
		contentPane.add(txtPalabra2);
		
		etiTexto = new JLabel("");
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		etiTexto.setBounds(24, 129, 388, 42);
		contentPane.add(etiTexto);
		
		btnConcatena = new JButton("Concatenar");
		btnConcatena.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnConcatena.setBounds(149, 211, 137, 42);
		btnConcatena.addActionListener(this);
		contentPane.add(btnConcatena);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnConcatena) {
			
			String palabra1 = txtPalabra1.getText();
			String palabra2 = txtPalabra2.getText();
			
			etiTexto.setText(palabra1+palabra2);
			
		}
		
	}

}
