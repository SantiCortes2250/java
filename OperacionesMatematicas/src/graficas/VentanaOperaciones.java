package graficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaOperaciones extends JFrame implements ActionListener{

	private JPanel panelPrincipal;
	private JTextField txtCampoNum1;
	private JTextField txtCampoNum2;


	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblTitle = new JLabel("OPERACIONES MATEMATICAS");
		lblTitle.setFont(new Font("Stencil", Font.ITALIC, 17));
		lblTitle.setBounds(107, 11, 253, 37);
		panelPrincipal.add(lblTitle);
		
		txtCampoNum1 = new JTextField();
		txtCampoNum1.setBounds(161, 69, 168, 25);
		panelPrincipal.add(txtCampoNum1);
		txtCampoNum1.setColumns(10);
		
		txtCampoNum2 = new JTextField();
		txtCampoNum2.setColumns(10);
		txtCampoNum2.setBounds(161, 110, 168, 25);
		panelPrincipal.add(txtCampoNum2);
		
		JLabel lblNum1 = new JLabel("Numero 1:");
		lblNum1.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNum1.setBounds(59, 73, 91, 17);
		panelPrincipal.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Numero 2:");
		lblNum2.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNum2.setBounds(60, 115, 91, 17);
		panelPrincipal.add(lblNum2);
		
		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSumar.setFont(new Font("Stencil", Font.ITALIC, 30));
		btnSumar.setForeground(Color.BLACK);
		btnSumar.setBackground(Color.RED);
		btnSumar.setBounds(44, 169, 52, 50);
		panelPrincipal.add(btnSumar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.setForeground(Color.BLACK);
		btnRestar.setFont(new Font("Stencil", Font.ITALIC, 40));
		btnRestar.setBackground(Color.GREEN);
		btnRestar.setBounds(135, 169, 52, 50);
		panelPrincipal.add(btnRestar);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setForeground(Color.BLACK);
		btnMultiplicar.setFont(new Font("Stencil", Font.ITALIC, 25));
		btnMultiplicar.setBackground(Color.BLUE);
		btnMultiplicar.setBounds(326, 169, 52, 50);
		panelPrincipal.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setForeground(Color.BLACK);
		btnDividir.setFont(new Font("Stencil", Font.ITALIC, 20));
		btnDividir.setBackground(Color.ORANGE);
		btnDividir.setBounds(228, 169, 52, 50);
		panelPrincipal.add(btnDividir);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
