package practica8;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class Interfaz extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel etiTexto;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnTransparente;
	private JButton btnVerde;
	private JButton btnFondoRojo;
	private JButton btnFondoVerde;
	private JButton btnFondoAzul;
	private JButton btnOpaca;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto = new JLabel("COLOR");
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		etiTexto.setBounds(216, 10, 89, 35);
		contentPane.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnAzul.setBounds(14, 142, 112, 35);
		btnAzul.addActionListener(this);
		contentPane.add(btnAzul);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRojo.setBounds(140, 142, 112, 35);
		btnRojo.addActionListener(this);
		contentPane.add(btnRojo);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnTransparente.setBounds(392, 142, 112, 35);
		btnTransparente.addActionListener(this);
		contentPane.add(btnTransparente);
		
		btnVerde = new JButton("Verde");
		btnVerde.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnVerde.setBounds(266, 142, 112, 35);
		btnVerde.addActionListener(this);
		contentPane.add(btnVerde);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnFondoAzul.setBounds(14, 192, 112, 35);
		btnFondoAzul.addActionListener(this);
		contentPane.add(btnFondoAzul);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnFondoRojo.setBounds(140, 192, 112, 35);
		btnFondoRojo.addActionListener(this);
		contentPane.add(btnFondoRojo);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnFondoVerde.setBounds(266, 192, 112, 35);
		btnFondoVerde.addActionListener(this);
		contentPane.add(btnFondoVerde);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnOpaca.setBounds(392, 192, 112, 35);
		btnOpaca.addActionListener(this);
		contentPane.add(btnOpaca);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnAzul) {

			etiTexto.setForeground(Color.BLUE);

		}
		if (e.getSource()==btnRojo) {

			etiTexto.setForeground(Color.RED);

		}
		if (e.getSource()==btnVerde) {

			etiTexto.setForeground(Color.GREEN);

		}
		if (e.getSource()==btnTransparente) {

			etiTexto.setForeground(new Color(0,0,0,0));

		}
		if (e.getSource()==btnFondoAzul) {

			etiTexto.setBackground(Color.BLUE);

		}
		if (e.getSource()==btnFondoRojo) {

			etiTexto.setBackground(Color.RED);

		}
		if (e.getSource()==btnFondoVerde) {

			etiTexto.setBackground(Color.GREEN);

		}
		if (e.getSource()==btnOpaca) {
			
			etiTexto.setOpaque(true);
			
		}
		
	}
}
