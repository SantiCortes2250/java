package practica11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.*;

public class Interfaz extends JFrame implements MouseListener {

	private JPanel panelPrincipal;
	private JTextField txtNumero;
	private JButton btnBorrar;
	private JLabel etiCero;
	private JLabel etiUna;
	private JLabel etiDos;
	private JLabel etiTres;
	private JLabel etiCuatro;
	private JLabel etiCinco;
	private JLabel etiSeis;
	private JLabel etiSiete;
	private JLabel etiOcho;
	private JLabel etiNueve;

	public Interfaz() {
		setBackground(new Color(240, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 300);
		setLocationRelativeTo(null);
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(240, 255, 255));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		etiCero = new JLabel("0");
		etiCero.setHorizontalAlignment(SwingConstants.CENTER);
		etiCero.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiCero.setBounds(10, 11, 50, 50);
		etiCero.addMouseListener(this);
		panelPrincipal.add(etiCero);
		
		etiUna = new JLabel("1");
		etiUna.setHorizontalAlignment(SwingConstants.CENTER);
		etiUna.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiUna.setBounds(70, 11, 50, 50);
		etiUna.addMouseListener(this);
		panelPrincipal.add(etiUna);
		
		etiDos = new JLabel("2");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiDos.setBounds(130, 11, 50, 50);
		etiDos.addMouseListener(this);
		panelPrincipal.add(etiDos);
		
		etiTres = new JLabel("3");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiTres.setBounds(190, 11, 50, 50);
		etiTres.addMouseListener(this);
		panelPrincipal.add(etiTres);
		
		etiCuatro = new JLabel("4");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiCuatro.setBounds(247, 11, 50, 50);
		etiCuatro.addMouseListener(this);
		panelPrincipal.add(etiCuatro);
		
		etiCinco = new JLabel("5");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiCinco.setBounds(10, 72, 50, 50);
		etiCinco.addMouseListener(this);
		panelPrincipal.add(etiCinco);
		
		etiSeis = new JLabel("6");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiSeis.setBounds(70, 72, 50, 50);
		etiSeis.addMouseListener(this);
		panelPrincipal.add(etiSeis);
		
		etiSiete = new JLabel("7");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiSiete.setBounds(130, 72, 50, 50);
		etiSiete.addMouseListener(this);
		panelPrincipal.add(etiSiete);
		
		etiOcho = new JLabel("8");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiOcho.setBounds(190, 72, 50, 50);
		etiOcho.addMouseListener(this);
		panelPrincipal.add(etiOcho);
		
		etiNueve = new JLabel("9");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		etiNueve.setBounds(247, 72, 50, 50);
		etiNueve.addMouseListener(this);
		panelPrincipal.add(etiNueve);
		
		txtNumero = new JTextField();
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtNumero.setBounds(10, 133, 287, 30);
		panelPrincipal.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnBorrar.setBounds(190, 189, 107, 42);
		btnBorrar.addMouseListener(this);
		panelPrincipal.add(btnBorrar);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource()==btnBorrar) {
			txtNumero.setText("");
		}
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
		if (e.getSource()==etiCero) {
			txtNumero.setText(txtNumero.getText()+"0");
		}
		if (e.getSource()==etiUna) {
			txtNumero.setText(txtNumero.getText()+"1");
		}
		if (e.getSource()==etiDos) {
			txtNumero.setText(txtNumero.getText()+"2");
		}
		if (e.getSource()==etiTres) {
			txtNumero.setText(txtNumero.getText()+"3");
		}
		if (e.getSource()==etiCuatro) {
			txtNumero.setText(txtNumero.getText()+"4");
		}
		if (e.getSource()==etiCinco) {
			txtNumero.setText(txtNumero.getText()+"5");
		}
		if (e.getSource()==etiSeis) {
			txtNumero.setText(txtNumero.getText()+"6");
		}
		if (e.getSource()==etiSiete) {
			txtNumero.setText(txtNumero.getText()+"7");
		}
		if (e.getSource()==etiOcho) {
			txtNumero.setText(txtNumero.getText()+"8");
		}
		if (e.getSource()==etiNueve) {
			txtNumero.setText(txtNumero.getText()+"9");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




}
