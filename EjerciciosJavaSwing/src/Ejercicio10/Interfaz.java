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

public class Interfaz extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JButton btnConcatena;
	private JLabel etiTexto;

	
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(28, 36, 143, 28);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(28, 94, 143, 28);
		contentPane.add(txtPalabra2);
		
		btnConcatena = new JButton("Concatenar");
		btnConcatena.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConcatena.setForeground(new Color(0, 0, 0));
		btnConcatena.setBackground(new Color(128, 128, 128));
		btnConcatena.setBounds(53, 172, 115, 38);
		btnConcatena.addActionListener(this);
		contentPane.add(btnConcatena);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiTexto.setBounds(217, 95, 192, 38);
		contentPane.add(etiTexto);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConcatena) {
			etiTexto.setText(txtPalabra1.getText()+txtPalabra2.getText());
		}
	}
}
