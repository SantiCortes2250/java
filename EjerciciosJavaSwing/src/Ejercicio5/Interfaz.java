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

public class Interfaz extends JFrame implements MouseListener{

	private JPanel contentPane;
	private JLabel etiPal1;
	private JLabel etiPal2;
	private JLabel etiPal3;
	private JLabel etiPal4;
	private JLabel etiOcultar;


	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel(" Carro");
		etiPal1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiPal1.setBackground(Color.LIGHT_GRAY);
		etiPal1.setForeground(new Color(0, 0, 0));
		etiPal1.setBounds(29, 60, 63, 47);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("  Moto");
		etiPal2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiPal2.setBackground(Color.LIGHT_GRAY);
		etiPal2.setForeground(new Color(0, 0, 0));
		etiPal2.setBounds(145, 60, 71, 47);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("  Avion");
		etiPal3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiPal3.setBackground(Color.LIGHT_GRAY);
		etiPal3.setForeground(new Color(0, 0, 0));
		etiPal3.setBounds(29, 146, 63, 47);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("  Varco");
		etiPal4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiPal4.setBackground(Color.LIGHT_GRAY);
		etiPal4.setForeground(new Color(0, 0, 0));
		etiPal4.setBounds(145, 146, 63, 47);
		contentPane.add(etiPal4);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setBackground(Color.WHITE);
		etiOcultar.setForeground(new Color(255, 0, 0));
		etiOcultar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiOcultar.setBounds(321, 159, 83, 20);
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
