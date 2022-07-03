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

public class VentanaPrincipal3 extends JFrame implements ActionListener, KeyListener{

	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel etiTexto;
	private JButton btnVaciar;
	


	public VentanaPrincipal3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(65, 37, 302, 66);
		txtTexto.addKeyListener(this);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		etiTexto.setBounds(65, 114, 302, 75);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 14));
		btnVaciar.setForeground(Color.RED);
		btnVaciar.setBackground(Color.BLACK);
		btnVaciar.setBounds(157, 200, 122, 50);
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
