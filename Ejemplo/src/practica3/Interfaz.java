package practica3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.*;

public class Interfaz extends JFrame implements KeyListener, ActionListener {

	private JPanel contentPane;
	private JTextField txtTexto;
	private JButton btnVaciar;
	private JLabel etiTexto;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTexto.setHorizontalAlignment(SwingConstants.CENTER);
		txtTexto.setBounds(10, 103, 416, 56);
		txtTexto.addKeyListener(this);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnVaciar.setBounds(10, 197, 416, 56);
		btnVaciar.addActionListener(this);
		contentPane.add(btnVaciar);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(10, 10, 416, 56);
		contentPane.add(etiTexto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnVaciar) {
			etiTexto.setText("");
			txtTexto.setText("");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource()==txtTexto) {
			etiTexto.setText(txtTexto.getText());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
