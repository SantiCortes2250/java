package practica5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Interfaz extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JLabel etiOcultar;
	private JLabel etiPal1;
	private JLabel etiPal2;
	private JLabel etiPal3;
	private JLabel etiPal4;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setForeground(Color.BLACK);
		etiOcultar.setOpaque(true);
		etiOcultar.setBackground(Color.LIGHT_GRAY);
		etiOcultar.setBackground(Color.white);
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		etiOcultar.setBounds(54, 163, 327, 51);
		etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
		
		etiPal1 = new JLabel("PADRE");
		etiPal1.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		etiPal1.setBounds(10, 10, 127, 38);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("MADRE");
		etiPal2.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		etiPal2.setBounds(299, 10, 127, 38);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("HIJO");
		etiPal3.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		etiPal3.setBounds(10, 70, 127, 38);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("NIETO");
		etiPal4.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		etiPal4.setBounds(299, 70, 127, 38);
		contentPane.add(etiPal4);
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

		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal3.setVisible(false);
			etiPal4.setVisible(false);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);
		}
		
	}

}
