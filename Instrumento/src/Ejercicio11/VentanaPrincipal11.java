package Ejercicio11;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class VentanaPrincipal11 extends JFrame implements ActionListener,MouseListener{

	private JPanel contentPane;
	private JTextField txtNumero;
	private JLabel etiUno;
	private JLabel etiDos;
	private JLabel etiTres;
	private JLabel etiCuatro;
	private JLabel etiCinco;
	private JLabel etiSeis;
	private JLabel etiSiete;
	private JLabel etiOcho;
	private JLabel etiNueve;
	private JLabel etiDiez;
	private JButton btnborrar;

	public VentanaPrincipal11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiUno = new JLabel("0");
		etiUno.setForeground(new Color(0, 0, 205));
		etiUno.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiUno.setBounds(34, 39, 46, 43);
		etiUno.addMouseListener(this);
		contentPane.add(etiUno);
		
		etiDos = new JLabel("1");
		etiDos.setForeground(new Color(0, 206, 209));
		etiDos.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiDos.setBounds(103, 39, 46, 43);
		etiDos.addMouseListener(this);
		contentPane.add(etiDos);
		
		etiTres = new JLabel("2");
		etiTres.setForeground(new Color(148, 0, 211));
		etiTres.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiTres.setBounds(170, 39, 46, 43);
		etiTres.addMouseListener(this);
		contentPane.add(etiTres);
		
		etiCuatro = new JLabel("3");
		etiCuatro.setForeground(new Color(255, 255, 0));
		etiCuatro.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiCuatro.setBounds(247, 39, 46, 43);
		etiCuatro.addMouseListener(this);
		contentPane.add(etiCuatro);
		
		etiCinco = new JLabel("4");
		etiCinco.setForeground(new Color(255, 69, 0));
		etiCinco.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiCinco.setBounds(331, 39, 46, 43);
		etiCinco.addMouseListener(this);
		contentPane.add(etiCinco);
		
		etiSeis = new JLabel("5");
		etiSeis.setForeground(new Color(0, 255, 127));
		etiSeis.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiSeis.setBounds(34, 93, 46, 43);
		etiSeis.addMouseListener(this);
		contentPane.add(etiSeis);
		
		etiSiete = new JLabel("6");
		etiSiete.setForeground(new Color(255, 20, 147));
		etiSiete.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiSiete.setBounds(103, 93, 46, 43);
		etiSiete.addMouseListener(this);
		contentPane.add(etiSiete);
		
		etiOcho = new JLabel("7");
		etiOcho.setForeground(new Color(65, 105, 225));
		etiOcho.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiOcho.setBounds(170, 93, 46, 43);
		etiOcho.addMouseListener(this);
		contentPane.add(etiOcho);
		
		etiNueve = new JLabel("8");
		etiNueve.setForeground(new Color(0, 255, 0));
		etiNueve.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiNueve.setBounds(247, 93, 46, 43);
		etiNueve.addMouseListener(this);
		contentPane.add(etiNueve);
		
	    etiDiez = new JLabel("9");
	    etiDiez.setForeground(new Color(255, 20, 147));
	    etiDiez.setFont(new Font("Times New Roman", Font.BOLD, 40));
		etiDiez.setBounds(331, 93, 46, 43);
		etiDiez.addMouseListener(this);
		contentPane.add(etiDiez);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtNumero.setForeground(new Color(0, 0, 0));
		txtNumero.setBounds(45, 169, 202, 81);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnborrar = new JButton("BORRAR");
		btnborrar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnborrar.setBackground(new Color(0, 0, 0));
		btnborrar.setForeground(new Color(255, 0, 0));
		btnborrar.setBounds(294, 214, 110, 36);
		btnborrar.addActionListener(this);
		contentPane.add(btnborrar);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
		if (e.getSource()==etiUno) {
			txtNumero.setText(txtNumero.getText()+"0");
		}
		if (e.getSource()==etiDos) {
			txtNumero.setText(txtNumero.getText()+"1");
		}
		if (e.getSource()==etiTres) {
			txtNumero.setText(txtNumero.getText()+"2");
		}
		if (e.getSource()==etiCuatro) {
			txtNumero.setText(txtNumero.getText()+"3");
		}
		if (e.getSource()==etiCinco) {
			txtNumero.setText(txtNumero.getText()+"4");
		}
		if (e.getSource()==etiSeis) {
			txtNumero.setText(txtNumero.getText()+"5");
		}
		if (e.getSource()==etiSiete) {
			txtNumero.setText(txtNumero.getText()+"6");
		}
		if (e.getSource()==etiOcho) {
			txtNumero.setText(txtNumero.getText()+"7");
		}
		if (e.getSource()==etiNueve) {
			txtNumero.setText(txtNumero.getText()+"8");
		}
		if (e.getSource()==etiDiez) {
			txtNumero.setText(txtNumero.getText()+"9");
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnborrar) {
			txtNumero.setText("");
		}
		
	}
}
