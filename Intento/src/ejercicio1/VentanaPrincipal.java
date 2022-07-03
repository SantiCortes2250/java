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

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnOcultarNombre, btnOcultarCiudad, btnVisuCiudad, btnVisuNombre;
	JLabel etiNombre, etiCiudad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("    SANTIAGO RINCON CORTES");
		etiNombre.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		etiNombre.setForeground(Color.WHITE);
		etiNombre.setBackground(Color.RED);
		etiNombre.setOpaque(true);
		etiNombre.setBounds(10, 69, 185, 27);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("    ARMENIA-QUINDIO");
		etiCiudad.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		etiCiudad.setForeground(Color.WHITE);
		etiCiudad.setBackground(Color.BLUE);
		etiCiudad.setOpaque(true);
		etiCiudad.setBounds(25, 165, 157, 27);
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBackground(new Color(105, 105, 105));
		btnOcultarNombre.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		btnOcultarNombre.setForeground(new Color(255, 255, 255));
		buttonGroup.add(btnOcultarNombre);
		btnOcultarNombre.setBounds(219, 42, 157, 27);
		btnOcultarNombre.addActionListener(this);
		contentPane.add(btnOcultarNombre);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setForeground(new Color(255, 255, 255));
		btnOcultarCiudad.setBackground(new Color(105, 105, 105));
		btnOcultarCiudad.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		btnOcultarCiudad.setBounds(219, 143, 157, 27);
		btnOcultarCiudad.addActionListener(this);
		contentPane.add(btnOcultarCiudad);
		
		btnVisuCiudad = new JButton("Visualizar Ciudad");
		btnVisuCiudad.setForeground(new Color(255, 255, 255));
		btnVisuCiudad.setBackground(new Color(105, 105, 105));
		btnVisuCiudad.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		btnVisuCiudad.setBounds(219, 187, 157, 27);
		btnVisuCiudad.addActionListener(this);
		contentPane.add(btnVisuCiudad);
		
		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setForeground(new Color(255, 255, 255));
		btnVisuNombre.setBackground(new Color(105, 105, 105));
		btnVisuNombre.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		btnVisuNombre.setBounds(219, 80, 157, 23);
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

