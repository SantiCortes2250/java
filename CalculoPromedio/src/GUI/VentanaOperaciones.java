package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaOperaciones extends JFrame implements ActionListener{

	private JPanel PanelPrincipal;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota3;
	private JTextField txtNota2;


	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 405);
		setTitle("CALCULO DE PROMEDIO");
		setLocationRelativeTo(null);
		iniciarComponentes();

	}
	
	private void iniciarComponentes() {
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		JLabel lbltitulo = new JLabel("Calcular Promedio");
		lbltitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setBounds(0, 11, 493, 35);
		PanelPrincipal.add(lbltitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(44, 86, 46, 14);
		PanelPrincipal.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(100, 78, 259, 31);
		PanelPrincipal.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNota = new JLabel("Nota 1:");
		lblNota.setBounds(44, 139, 46, 14);
		PanelPrincipal.add(lblNota);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(104, 125, 61, 42);
		PanelPrincipal.add(txtNota1);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(342, 139, 46, 14);
		PanelPrincipal.add(lblNota3);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(199, 139, 46, 14);
		PanelPrincipal.add(lblNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(392, 125, 61, 42);
		PanelPrincipal.add(txtNota3);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(255, 125, 61, 42);
		PanelPrincipal.add(txtNota2);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPromedio.setBounds(44, 258, 83, 23);
		PanelPrincipal.add(lblPromedio);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblResultado.setBounds(44, 292, 83, 35);
		PanelPrincipal.add(lblResultado);
		
		JLabel lblResultProm = new JLabel("");
		lblResultProm.setBounds(135, 258, 110, 29);
		PanelPrincipal.add(lblResultProm);
		
		JLabel lblResult = new JLabel("");
		lblResult.setBounds(141, 292, 114, 42);
		PanelPrincipal.add(lblResult);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(342, 205, 89, 23);
		PanelPrincipal.add(btnCalcular);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
