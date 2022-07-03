package practica1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnVisuCiudad;
	private JButton btnVisuNombre;
	private JButton btnOcultarCiudad;
	private JButton btnOcultarNombre;
	private JLabel etiCiudad;
	private JLabel etiNombre;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Oscar Humberto Marin Molina");
		etiNombre.setBackground(new Color(255, 255, 255));
		etiNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBounds(29, 10, 377, 36);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("Calarca");
		etiCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		etiCiudad.setBounds(29, 64, 377, 36);
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnOcultarNombre.setBounds(10, 110, 184, 36);
		btnOcultarNombre.addActionListener(this);
		contentPane.add(btnOcultarNombre);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnOcultarCiudad.setBounds(242, 110, 184, 36);
		btnOcultarCiudad.addActionListener(this);
		contentPane.add(btnOcultarCiudad);
		
		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnVisuNombre.setBounds(10, 156, 184, 36);
		btnVisuNombre.addActionListener(this);
		contentPane.add(btnVisuNombre);
		
		btnVisuCiudad = new JButton("Visualizar Ciudad");
		btnVisuCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnVisuCiudad.setBounds(242, 156, 184, 36);
		btnVisuCiudad.addActionListener(this);
		contentPane.add(btnVisuCiudad);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnOcultarNombre) {
			etiNombre.setVisible(false);
		}
		if (e.getSource()==btnVisuNombre) {
			etiNombre.setVisible(true);
		}
		if (e.getSource()==btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		}
		if (e.getSource()==btnVisuCiudad) {
			etiCiudad.setVisible(true);
		}
		
	}
}
