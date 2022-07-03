package Ejercicio6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal6 extends JFrame implements ActionListener, MouseListener{

	private JPanel contentPane;
	private JLabel etiNombre;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAgrandar;
	private JButton btnAchicar;

	public VentanaPrincipal6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel(" Santiago");
		etiNombre.setFont(new Font("Times New Roman", Font.BOLD, 22));
		etiNombre.setOpaque(true);
		etiNombre.setForeground(Color.BLUE);
		etiNombre.setBackground(Color.BLACK);
		etiNombre.setBounds(159, 90, 98, 41);
		etiNombre.addMouseListener(this);
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("ESQUINA");
		btnEsquina.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnEsquina.setForeground(Color.WHITE);
		btnEsquina.setBackground(Color.BLACK);
		btnEsquina.setBounds(10, 197, 89, 23);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("CENTRO");
		btnCentro.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnCentro.setForeground(Color.WHITE);
		btnCentro.setBackground(Color.BLACK);
		btnCentro.setBounds(116, 197, 89, 23);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		contentPane.add(btnCentro);
		
		btnAgrandar = new JButton("AGRANDAR");
		btnAgrandar.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnAgrandar.setForeground(Color.WHITE);
		btnAgrandar.setBackground(Color.BLACK);
		btnAgrandar.setBounds(215, 197, 105, 23);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		contentPane.add(btnAgrandar);
		
		btnAchicar = new JButton("ACHICAR");
		btnAchicar.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnAchicar.setForeground(Color.WHITE);
		btnAchicar.setBackground(Color.BLACK);
		btnAchicar.setBounds(335, 197, 89, 23);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
		contentPane.add(btnAchicar);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==btnEsquina) {
			btnEsquina.setSize(100,30);
		}
		
		if(e.getSource()==btnCentro) {
			btnCentro.setSize(100,30);
		}
		if(e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(100,30);
		}
		if(e.getSource()==btnAchicar) {
			btnAchicar.setSize(100,30);
		}

		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==btnEsquina) {
			btnEsquina.setSize(90, 25);
		}
		
		if(e.getSource()==btnCentro) {
			btnCentro.setSize(90, 25);		
		}
		if(e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(100, 25);
		}
		if(e.getSource()==btnAchicar) {
			btnAchicar.setSize(90, 25);
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int Height = 45;
		int width = 110;
		
		
		if(e.getSource()==btnEsquina) {
			etiNombre.setLocation(0, 0);
		}
		if(e.getSource()==btnCentro) {
			etiNombre.setLocation(167, 74);
		}
		if(e.getSource()==btnAgrandar) {
			width=width+15;
			Height=Height+15;
			etiNombre.setSize(width, Height);
		}
		if(e.getSource()==btnAchicar) {
			width=width-15;
			Height=Height-15;
			etiNombre.setSize(width, Height);
		}
		
	}

}
