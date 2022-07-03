package practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTexto;
	private JButton btnTraspasa2;
	private JButton btnTraspasa1;
	private JLabel etiTexto2;
	private JLabel etiTexto1;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTexto.setBounds(17, 108, 402, 47);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		etiTexto1.setBounds(17, 10, 402, 39);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		etiTexto2.setBounds(17, 59, 402, 39);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnTraspasa1.setBounds(17, 184, 175, 39);
		btnTraspasa1.addActionListener(this);
		contentPane.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnTraspasa2.setBounds(244, 184, 175, 39);
		btnTraspasa2.addActionListener(this);
		contentPane.add(btnTraspasa2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String texto = txtTexto.getText();
		
		if (e.getSource()==btnTraspasa1) {
			etiTexto1.setText(texto);
		}
		if (e.getSource()==btnTraspasa2) {
			etiTexto2.setText(texto);
		}
		
	}
}
