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

public class Interfaz extends JFrame implements ActionListener{

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


	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto = new JLabel("         HOLAAA");
		etiTexto.setForeground(new Color(0, 0, 0));
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiTexto.setBounds(320, 99, 104, 49);
		contentPane.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBackground(new Color(128, 128, 128));
		btnAzul.setForeground(Color.BLUE);
		btnAzul.setBounds(10, 11, 89, 23);
		btnAzul.addActionListener(this);
		contentPane.add(btnAzul);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBackground(new Color(128, 128, 128));
		btnRojo.setForeground(Color.RED);
		btnRojo.setBounds(120, 11, 89, 23);
		btnRojo.addActionListener(this);
		contentPane.add(btnRojo);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setForeground(new Color(255, 0, 0));
		btnFondoRojo.setBackground(new Color(105, 105, 105));
		btnFondoRojo.setBounds(142, 165, 117, 23);
		btnFondoRojo.addActionListener(this);
		contentPane.add(btnFondoRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBackground(new Color(128, 128, 128));
		btnVerde.setForeground(Color.GREEN);
		btnVerde.setBounds(23, 69, 89, 23);
		btnVerde.addActionListener(this);
		contentPane.add(btnVerde);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBackground(new Color(128, 128, 128));
		btnOpaca.setBounds(23, 165, 89, 23);
		btnOpaca.addActionListener(this);
		contentPane.add(btnOpaca);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setForeground(new Color(124, 252, 0));
		btnFondoVerde.setBackground(new Color(128, 128, 128));
		btnFondoVerde.setBounds(45, 118, 133, 23);
		btnFondoVerde.addActionListener(this);
		contentPane.add(btnFondoVerde);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBackground(new Color(128, 128, 128));
		btnTransparente.setBounds(23, 211, 136, 23);
		btnTransparente.addActionListener(this);
		contentPane.add(btnTransparente);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setForeground(new Color(0, 0, 205));
		btnFondoAzul.setBackground(new Color(128, 128, 128));
		btnFondoAzul.setBounds(124, 69, 111, 23);
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
		}
		if(e.getSource()==btnOpaca) {
			etiTexto.setOpaque(true);
		}
		
	}
}
