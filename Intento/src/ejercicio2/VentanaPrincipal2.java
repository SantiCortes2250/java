package ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class VentanaPrincipal2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel etiTexto1, etiTexto2;
	private JButton btnTraspasa1, btnTraspasa2;
	


	public VentanaPrincipal2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(132, 41, 165, 33);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setBounds(73, 113, 143, 33);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		etiTexto2.setBounds(73, 157, 143, 33);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnTraspasa1.setForeground(Color.WHITE);
		btnTraspasa1.setBackground(Color.BLACK);
		btnTraspasa1.setBounds(271, 118, 122, 28);
		btnTraspasa1.addActionListener(this);
		contentPane.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnTraspasa2.setForeground(Color.WHITE);
		btnTraspasa2.setBackground(Color.BLACK);
		btnTraspasa2.addActionListener(this);
		btnTraspasa2.setBounds(271, 162, 122, 28);
		contentPane.add(btnTraspasa2);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTraspasa1) {
			etiTexto1.setText(txtTexto.getText());
			etiTexto1.setVisible(true);
			etiTexto2.setVisible(false);
			
		}
		if(e.getSource()==btnTraspasa2) {
			etiTexto2.setText(txtTexto.getText());
			etiTexto2.setVisible(true);
			etiTexto1.setVisible(false);
		}
		
	}

}
