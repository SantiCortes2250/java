package Vistas.ventanas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import Controlador.Coordinador;
import Modelo.Procesos;

import java.awt.event.*;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lblTitle;
	private JButton btnRegister;
	private JButton btnConsult;

	
	private Coordinador myCoordinator;
	
	public void setCoordinator(Coordinador myCoordinator) {
		this.myCoordinator = myCoordinator;
	}
	
	public VentanaPrincipal() {
		
		startComponents();
		
	}
	
	public void startComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitle = new JLabel("Hospital San Nicolas");
		lblTitle.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 22, 416, 62);
		contentPane.add(lblTitle);
		
		btnRegister = new JButton("Registrar Pacientes");
		btnRegister.addActionListener(this);
		btnRegister.setBounds(46, 127, 146, 55);
		contentPane.add(btnRegister);
		
		btnConsult = new JButton("Consultar Pacientes");
		btnConsult.setBounds(259, 127, 146, 55);
		contentPane.add(btnConsult);
		btnConsult.addActionListener(this);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnRegister) {
			myCoordinator.showLogWindow();
		}
		
		if (e.getSource()==btnConsult) {
			myCoordinator.showQueryWindow();
		}
		
	}
	
	
	
	

}
