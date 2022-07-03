package practica6;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;

public class Interfaz extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JButton btnAchicar;
	private JButton btnAgrandar;
	private Container btnCentro;
	private JButton btnEsquina;
	private JLabel etiNombre;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Oscar");
		etiNombre.setOpaque(true);
		etiNombre.setBackground(new Color(153, 255, 255));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		etiNombre.setBounds(167, 74, 101, 41);
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnEsquina.setBounds(10, 221, 108, 32);
		btnEsquina.addMouseListener(this);
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCentro.setBounds(318, 221, 108, 32);
		btnCentro.addMouseListener(this);
		contentPane.add(btnCentro);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAgrandar.setBounds(95, 179, 108, 32);
		btnAgrandar.addMouseListener(this);
		contentPane.add(btnAgrandar);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAchicar.setBounds(232, 179, 108, 32);
		btnAchicar.addMouseListener(this);
		contentPane.add(btnAchicar);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		int width = 101;
		int Height = 41;
		
		if (e.getSource()==btnEsquina) {
			etiNombre.setLocation(0, 0);
		}
		if (e.getSource()==btnCentro) {
			etiNombre.setLocation(167, 74);
		}
		if (e.getSource()==btnAgrandar) {
			width=width+20;
			Height=Height+20;
			etiNombre.setSize(width, Height);
		} else if (e.getSource()==btnAchicar) {
			width=width-20;
			Height=Height-20;
			etiNombre.setSize(width, Height);
		}
		
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

		if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(118, 42);
		}
		if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(118, 42);
		}
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(118, 42);
		}
		if (e.getSource()==btnCentro) {
			btnCentro.setSize(118, 42);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(108, 32);
		}
		if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(108, 32);
		}
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(108, 32);
		}
		if (e.getSource()==btnCentro) {
			btnCentro.setSize(108, 32);
		}
		
	}

}
