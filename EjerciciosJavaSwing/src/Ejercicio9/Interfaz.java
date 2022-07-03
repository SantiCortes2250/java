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

public class Interfaz extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JButton btnCalcular;
	private JLabel etiNotaFinal;
	private JLabel etiResultado;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(25, 28, 148, 24);
		txtPrimerTrimestre.addActionListener(this);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.addActionListener(this);
		txtSegundoTrimestre.setBounds(25, 75, 148, 24);
		contentPane.add(txtSegundoTrimestre);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(25, 120, 148, 24);
		txtTercerTrimestre.addActionListener(this);
		contentPane.add(txtTercerTrimestre);
		
		etiNotaFinal = new JLabel("Nota Final");
		etiNotaFinal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiNotaFinal.setBounds(298, 55, 63, 24);
		contentPane.add(etiNotaFinal);
		
		etiResultado = new JLabel("Resultado");
		etiResultado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		etiResultado.setBounds(298, 120, 63, 24);
		contentPane.add(etiResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCalcular.setForeground(new Color(0, 0, 0));
		btnCalcular.setBackground(new Color(128, 128, 128));
		btnCalcular.setBounds(178, 190, 85, 39);
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
		
		etiNotaFinal.setText(notaFinal+"");
		
		if (notaFinal>=5) {
			etiResultado.setText("APROBADO");
		} else {
			etiResultado.setText("APROBADO");
			etiResultado.setText("SUSPENSO");
			etiResultado.setForeground(Color.RED);
		} 
		
	}
}
