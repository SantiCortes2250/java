package Ejercicio10;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class VentanaPrincipal10 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JButton btnConcatena;
	private JLabel etiTexto;
	private JLabel lblPalabra1;
	private JLabel lblPalabra2;

	
	public VentanaPrincipal10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(87, 76, 109, 28);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(266, 76, 128, 28);
		contentPane.add(txtPalabra2);
		
		btnConcatena = new JButton("Concatenar");
		btnConcatena.setFont(new Font("Serif", Font.BOLD, 14));
		btnConcatena.setForeground(new Color(255, 255, 255));
		btnConcatena.setBackground(new Color(0, 0, 0));
		btnConcatena.setBounds(143, 151, 115, 38);
		btnConcatena.addActionListener(this);
		contentPane.add(btnConcatena);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		etiTexto.setBounds(179, 209, 109, 28);
		contentPane.add(etiTexto);
		
		lblPalabra1 = new JLabel("Palabra 1:");
		lblPalabra1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPalabra1.setForeground(new Color(0, 0, 0));
		lblPalabra1.setBounds(25, 76, 128, 28);
		contentPane.add(lblPalabra1);
		
		lblPalabra2 = new JLabel("Palabra 2:");
		lblPalabra2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPalabra2.setForeground(new Color(0, 0, 0));
		lblPalabra2.setBounds(206, 80, 89, 21);
		contentPane.add(lblPalabra2);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConcatena) {
			etiTexto.setText(txtPalabra1.getText()+txtPalabra2.getText());
		}
	}
}
