package ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Interfaz extends JFrame implements ActionListener, KeyListener{

	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel etiTexto;
	private JButton btnVaciar;
	


	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(21, 33, 169, 142);
		txtTexto.addKeyListener(this);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiTexto.setBounds(200, 66, 224, 75);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVaciar.setForeground(new Color(0, 0, 0));
		btnVaciar.setBackground(new Color(128, 128, 128));
		btnVaciar.setBounds(325, 204, 72, 34);
		btnVaciar.addActionListener(this);
		contentPane.add(btnVaciar);
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txtTexto) {
			etiTexto.setText(txtTexto.getText());
		}
		
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnVaciar) {
			etiTexto.setText("");
			txtTexto.setText("");
		}
		
	}


}
