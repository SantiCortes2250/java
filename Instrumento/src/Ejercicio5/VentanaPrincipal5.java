package Ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

public class VentanaPrincipal5 extends JFrame implements MouseListener{

	private JPanel contentPane;
	private JLabel etiPal1;
	private JLabel etiPal2;
	private JLabel etiPal3;
	private JLabel etiPal4;
	private JLabel etiOcultar;


	public VentanaPrincipal5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel(" LORO");
		etiPal1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		etiPal1.setBackground(Color.LIGHT_GRAY);
		etiPal1.setForeground(Color.CYAN);
		etiPal1.setOpaque(true);
		etiPal1.setBounds(18, 60, 63, 47);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("  PERRO");
		etiPal2.setFont(new Font("Segoe Print", Font.BOLD, 14));
		etiPal2.setBackground(Color.LIGHT_GRAY);
		etiPal2.setForeground(Color.YELLOW);
		etiPal2.setOpaque(true);
		etiPal2.setBounds(121, 60, 71, 47);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("  GATO");
		etiPal3.setFont(new Font("Segoe Print", Font.BOLD, 14));
		etiPal3.setBackground(Color.LIGHT_GRAY);
		etiPal3.setForeground(Color.BLUE);
		etiPal3.setOpaque(true);
		etiPal3.setBounds(238, 60, 63, 47);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("  PEZ");
		etiPal4.setFont(new Font("Segoe Print", Font.BOLD, 14));
		etiPal4.setBackground(Color.LIGHT_GRAY);
		etiPal4.setForeground(Color.RED);
		etiPal4.setOpaque(true);
		etiPal4.setBounds(331, 60, 63, 47);
		contentPane.add(etiPal4);
		
		etiOcultar = new JLabel("OCULTAR");
		etiOcultar.setBackground(Color.WHITE);
		etiOcultar.setForeground(Color.BLUE);
		etiOcultar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		etiOcultar.setBounds(169, 166, 83, 20);
		etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		if(e.getSource()==etiOcultar) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal3.setVisible(false);
			etiPal4.setVisible(false);
		}
	}



	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);
		}

		
	}

}
