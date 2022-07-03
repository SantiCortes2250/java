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

public class Interfaz extends JFrame implements ActionListener, MouseListener{

	private JPanel contentPane;
	private JLabel etiNombre;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAgrandar;
	private JButton btnAchicar;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Kevin Usama");
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiNombre.setForeground(new Color(0, 0, 0));
		etiNombre.setBackground(new Color(255, 0, 0));
		etiNombre.setOpaque(true);
		etiNombre.setBounds(174, 90, 98, 41);
		etiNombre.addMouseListener(this);
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEsquina.setForeground(new Color(0, 0, 0));
		btnEsquina.setBackground(new Color(128, 128, 128));
		btnEsquina.setBounds(76, 180, 89, 23);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCentro.setForeground(new Color(0, 0, 0));
		btnCentro.setBackground(new Color(128, 128, 128));
		btnCentro.setBounds(20, 227, 89, 23);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		contentPane.add(btnCentro);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAgrandar.setForeground(new Color(0, 0, 0));
		btnAgrandar.setBackground(new Color(128, 128, 128));
		btnAgrandar.setBounds(186, 180, 105, 23);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		contentPane.add(btnAgrandar);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAchicar.setForeground(new Color(0, 0, 0));
		btnAchicar.setBackground(new Color(128, 128, 128));
		btnAchicar.setBounds(304, 227, 89, 23);
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
		
		int Height = 40;
		int width = 115;
		
		
		if(e.getSource()==btnEsquina) {
			etiNombre.setLocation(0, 0);
		}
		if(e.getSource()==btnCentro) {
			etiNombre.setLocation(166, 75);
		}
		if(e.getSource()==btnAgrandar) {
			width=width+20;
			Height=Height+20;
			etiNombre.setSize(width, Height);
		}
		if(e.getSource()==btnAchicar) {
			width=width-20;
			Height=Height-20;
			etiNombre.setSize(width, Height);
		}
		
	}

}
