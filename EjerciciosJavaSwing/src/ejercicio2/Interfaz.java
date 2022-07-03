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

public class Interfaz extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel etiTexto1, etiTexto2;
	private JButton btnTraspasa1, btnTraspasa2;
	


	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(132, 41, 165, 33);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setBounds(86, 162, 143, 33);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiTexto2.setBounds(254, 162, 143, 33);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTraspasa1.setForeground(new Color(0, 0, 0));
		btnTraspasa1.setBackground(new Color(128, 128, 128));
		btnTraspasa1.setBounds(76, 123, 122, 28);
		btnTraspasa1.addActionListener(this);
		contentPane.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTraspasa2.setForeground(new Color(0, 0, 0));
		btnTraspasa2.setBackground(new Color(128, 128, 128));
		btnTraspasa2.addActionListener(this);
		btnTraspasa2.setBounds(232, 123, 122, 28);
		contentPane.add(btnTraspasa2);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTraspasa1) {
			etiTexto1.setText(txtTexto.getText());

			
		}
		if(e.getSource()==btnTraspasa2) {
			etiTexto2.setText(txtTexto.getText());
		}
		
	}

}
