package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.Font;

public class Interfaz extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnOcultarNombre, btnOcultarCiudad, btnVisuCiudad, btnVisuNombre;
	JLabel etiNombre, etiCiudad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("  KEVIN USAMA");
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiNombre.setForeground(new Color(0, 0, 0));
		etiNombre.setBackground(new Color(255, 255, 255));
		etiNombre.setBounds(139, 11, 98, 27);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("    ARMENIA-QUINDIO");
		etiCiudad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiCiudad.setForeground(new Color(0, 0, 0));
		etiCiudad.setBackground(new Color(255, 255, 255));
		etiCiudad.setBounds(126, 144, 122, 27);
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBackground(new Color(128, 128, 128));
		btnOcultarNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOcultarNombre.setForeground(new Color(0, 0, 0));
		buttonGroup.add(btnOcultarNombre);
		btnOcultarNombre.setBounds(10, 72, 157, 27);
		btnOcultarNombre.addActionListener(this);
		contentPane.add(btnOcultarNombre);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setForeground(new Color(0, 0, 0));
		btnOcultarCiudad.setBackground(new Color(128, 128, 128));
		btnOcultarCiudad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOcultarCiudad.setBounds(35, 203, 157, 27);
		btnOcultarCiudad.addActionListener(this);
		contentPane.add(btnOcultarCiudad);
		
		btnVisuCiudad = new JButton("Visualizar Ciudad");
		btnVisuCiudad.setForeground(new Color(0, 0, 0));
		btnVisuCiudad.setBackground(new Color(128, 128, 128));
		btnVisuCiudad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVisuCiudad.setBounds(244, 203, 157, 27);
		btnVisuCiudad.addActionListener(this);
		contentPane.add(btnVisuCiudad);
		
		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setForeground(new Color(0, 0, 0));
		btnVisuNombre.setBackground(new Color(105, 105, 105));
		btnVisuNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVisuNombre.setBounds(202, 72, 157, 27);
		btnVisuNombre.addActionListener(this);
		contentPane.add(btnVisuNombre);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOcultarNombre) {
			etiNombre.setVisible(false);
		}
		if(e.getSource()==btnVisuNombre) {
			etiNombre.setVisible(true);
		}
		if(e.getSource()==btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		}
		if(e.getSource()==btnVisuCiudad) {
			etiCiudad.setVisible(true);
		}

		
	}
}

