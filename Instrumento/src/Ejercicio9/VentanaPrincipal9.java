package Ejercicio9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class VentanaPrincipal9 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JLabel etiRespuesta;
	private JLabel etiResultadoNota;
	private JButton btnCalcular;

	public VentanaPrincipal9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiPrimerTrimestre = new JLabel("Primer Trimestre:");
		etiPrimerTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiPrimerTrimestre.setBounds(62, 48, 132, 24);
		contentPane.add(etiPrimerTrimestre);
		
		JLabel etiSegundoTrimestre = new JLabel("Segundo Trimestre:");
		etiSegundoTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiSegundoTrimestre.setBounds(62, 83, 148, 24);
		contentPane.add(etiSegundoTrimestre);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(189, 48, 148, 24);
		txtPrimerTrimestre.addActionListener(this);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.addActionListener(this);
		txtSegundoTrimestre.setBounds(189, 83, 148, 24);
		contentPane.add(txtSegundoTrimestre);
		
		JLabel etiTercerTrimestre = new JLabel("Tercer Trimestre:");
		etiTercerTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiTercerTrimestre.setBounds(62, 118, 143, 24);
		contentPane.add(etiTercerTrimestre);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(189, 118, 148, 24);
		txtTercerTrimestre.addActionListener(this);
		contentPane.add(txtTercerTrimestre);
		
		JLabel etiNotaFinal = new JLabel("Nota Final:");
		etiNotaFinal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		etiNotaFinal.setBounds(62, 182, 63, 24);
		contentPane.add(etiNotaFinal);
		
		JLabel etiResultado = new JLabel("Resultado:");
		etiResultado.setFont(new Font("Times New Roman", Font.BOLD, 12));
		etiResultado.setBounds(62, 217, 63, 24);
		contentPane.add(etiResultado);
		
		etiResultadoNota = new JLabel("");
		etiResultadoNota.setBounds(140, 187, 74, 19);
		contentPane.add(etiResultadoNota);
		
		etiRespuesta = new JLabel("");
		etiRespuesta.setBounds(140, 222, 74, 19);
		contentPane.add(etiRespuesta);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Stencil", Font.PLAIN, 14));
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setBackground(Color.DARK_GRAY);
		btnCalcular.setBounds(297, 205, 112, 36);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
		double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
		double nota3 = Double.parseDouble(txtTercerTrimestre.getText());
		
		
		
		double nota = (nota1+nota2+nota3)/3;
		double notaFinal = Math.round(nota*100.0)/100.0;
		
		etiResultadoNota.setText(notaFinal+"");
		
		if (notaFinal>=5) {
			etiRespuesta.setText("APROBADO");
		} else {
			etiRespuesta.setText("APROBADO");
			etiRespuesta.setText("SUSPENSO");
			etiRespuesta.setForeground(Color.RED);
		} 
		
	}
}
