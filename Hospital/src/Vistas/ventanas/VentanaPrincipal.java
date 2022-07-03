package Vistas.ventanas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import Controlador.Coordinador;
import Modelo.Procesos;

import java.awt.event.*;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnRegistrar;
	private JButton btnConsultar;

	
	private Coordinador miCoordinador;
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
	
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\santi\\Workspace Web\\Hospital\\src\\Imagenes\\LogoHospital.jfif"));
		setTitle("Hospital San Nicolas");
		
		startComponents();
		
	}
	
	public void startComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 323);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRegistrar = new JButton("Registrar Pacientes");
		btnRegistrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(246, 162, 175, 55);
		contentPane.add(btnRegistrar);
		
		btnConsultar = new JButton("Consultar Pacientes");
		btnConsultar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnConsultar.setBounds(246, 65, 175, 55);
		contentPane.add(btnConsultar);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBackground(Color.WHITE);
		lblIcon.setIcon(new ImageIcon("C:\\Users\\santi\\Workspace Web\\Hospital\\src\\Imagenes\\LogoHospital.jfif"));
		lblIcon.setBounds(0, 0, 206, 284);
		lblIcon.setOpaque(true);
		contentPane.add(lblIcon);
		btnConsultar.addActionListener(this);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnRegistrar) {
			miCoordinador.MostrarVentanaRegistro();
		}
		
		if (e.getSource()==btnConsultar) {
			miCoordinador.MostrarVentanaConsulta();
		}
		
	}
}
