package Ejercicio8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal8 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel etiTexto;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnFondoRojo;
	private JButton btnVerde;
	private JButton btnOpaca;
	private JButton btnFondoVerde;
	private JButton btnTransparente;
	private JButton btnFondoAzul;


	public VentanaPrincipal8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto = new JLabel("Bienvenido");
		etiTexto.setForeground(Color.WHITE);
		etiTexto.setFont(new Font("Times New Roman", Font.BOLD, 16));
		etiTexto.setBounds(164, 40, 82, 38);
		contentPane.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setForeground(Color.BLUE);
		btnAzul.setBounds(99, 122, 89, 23);
		btnAzul.addActionListener(this);
		contentPane.add(btnAzul);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setForeground(Color.RED);
		btnRojo.setBounds(224, 122, 89, 23);
		btnRojo.addActionListener(this);
		contentPane.add(btnRojo);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setBackground(Color.RED);
		btnFondoRojo.setBounds(274, 165, 117, 23);
		btnFondoRojo.addActionListener(this);
		contentPane.add(btnFondoRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setForeground(Color.GREEN);
		btnVerde.setBounds(54, 165, 89, 23);
		btnVerde.addActionListener(this);
		contentPane.add(btnVerde);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBounds(310, 208, 89, 23);
		btnOpaca.addActionListener(this);
		contentPane.add(btnOpaca);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setBackground(Color.GREEN);
		btnFondoVerde.setBounds(10, 208, 133, 23);
		btnFondoVerde.addActionListener(this);
		contentPane.add(btnFondoVerde);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(164, 208, 136, 23);
		btnTransparente.addActionListener(this);
		contentPane.add(btnTransparente);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setBackground(Color.BLUE);
		btnFondoAzul.setBounds(153, 165, 111, 23);
		btnFondoAzul.addActionListener(this);
		contentPane.add(btnFondoAzul);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAzul) {
			etiTexto.setForeground(Color.BLUE);
		}
		if(e.getSource()==btnRojo) {
			etiTexto.setForeground(Color.RED);
		}
		if(e.getSource()==btnVerde) {
			etiTexto.setForeground(Color.GREEN);
		}
		if(e.getSource()==btnFondoAzul) {
			etiTexto.setBackground(Color.BLUE);
		}
		if(e.getSource()==btnFondoRojo) {
			etiTexto.setBackground(Color.RED);
		}
		if(e.getSource()==btnFondoVerde) {
			etiTexto.setBackground(Color.GREEN);
		}
		if(e.getSource()==btnTransparente) {
			etiTexto.setForeground(new Color(0,0,0,0));
			etiTexto.setOpaque(false);
		}
		if(e.getSource()==btnOpaca) {
			etiTexto.setOpaque(true);
		}
		
	}
}
