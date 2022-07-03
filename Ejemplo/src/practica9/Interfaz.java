package practica9;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Interfaz extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JButton btnCalcular;
	private JLabel etiResultado;
	private JLabel etiNotaFinal;

	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtPrimerTrimestre.setBounds(16, 10, 124, 33);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.setBounds(156, 10, 124, 33);
		contentPane.add(txtSegundoTrimestre);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(296, 10, 124, 33);
		contentPane.add(txtTercerTrimestre);
		
		etiNotaFinal = new JLabel("");
		etiNotaFinal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		etiNotaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		etiNotaFinal.setBounds(131, 97, 173, 33);
		contentPane.add(etiNotaFinal);
		
		etiResultado = new JLabel("");
		etiResultado.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		etiResultado.setHorizontalAlignment(SwingConstants.CENTER);
		etiResultado.setBounds(131, 146, 173, 33);
		contentPane.add(etiResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCalcular.setBounds(131, 220, 173, 33);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnCalcular) {
			double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
			double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
			double nota3 = Double.parseDouble(txtTercerTrimestre.getText());
			
			double nota = (nota1+nota2+nota3)/3;
			double notaFinal = Math.round(nota*100.0)/100.0;
			
			etiNotaFinal.setText(notaFinal+"");
			
			if (notaFinal<5) {
				etiResultado.setText("SUSPENSO");
				etiResultado.setForeground(Color.RED);
			} else {
				etiResultado.setText("APROBADO");
			}
			
		}
		
	}
}
