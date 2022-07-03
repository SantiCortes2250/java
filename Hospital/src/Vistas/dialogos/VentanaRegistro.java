package Vistas.dialogos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import Controlador.Coordinador;
import Modelo.VO.PersonVO;

public class VentanaRegistro extends JDialog implements ActionListener{
	
	private Coordinador miCoordinador;

	private final JPanel contentPanel = new JPanel();
	private JButton btnSalir;
	private JPanel buttonPane;
	private JTextField txtEmpresa;
	private JTextField txtDocumento;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtMedicamentos;
	private Container lblTituloRegistro;
	private JLabel lblEmpresa;
	private JLabel lblDocumento;
	private JLabel lblNombre;
	private JLabel lblDireccion;
	private JLabel lblTelefono;
	private JLabel lblTipo;
	private JRadioButton rdbtnOperario;
	private JRadioButton rdbtnMinero;
	private JLabel lblTratamiento;
	private JComboBox comboBox;
	private JLabel lblDias;
	private JLabel lblMedicamentos;
	private JTextField txtMedicamento;
	private JButton btnRegistrar;
	private JTextArea textAreaRegistro;
	private PersonVO miPerson;
	private JLabel llblIcono;
	private JLabel lblBanner;

	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	public VentanaRegistro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\santi\\Workspace Web\\Hospital\\src\\Imagenes\\LogoHospital.jfif"));
		setTitle("Hospital San Nicolas");
		setBounds(330, 80, 618, 653);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(176, 196, 222));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTituloRegistro = new JLabel("Registrar Paciente");
		lblTituloRegistro.setBounds(358, 14, 219, 36);
		lblTituloRegistro.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPanel.add(lblTituloRegistro);
		
		lblEmpresa = new JLabel("Nombre Empresa:");
		lblEmpresa.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEmpresa.setBounds(302, 195, 117, 23);
		contentPanel.add(lblEmpresa);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setBounds(399, 196, 164, 21);
		contentPanel.add(txtEmpresa);
		txtEmpresa.setColumns(10);
		
		lblDocumento = new JLabel("Documento:");
		lblDocumento.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDocumento.setBounds(324, 61, 87, 15);
		contentPanel.add(lblDocumento);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(399, 58, 164, 21);
		contentPanel.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNombre.setBounds(325, 87, 64, 15);
		contentPanel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(399, 87, 164, 21);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDireccion.setBounds(324, 126, 78, 15);
		contentPanel.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(399, 123, 164, 21);
		contentPanel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTelefono.setBounds(324, 164, 81, 15);
		contentPanel.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(399, 161, 164, 21);
		contentPanel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTipo.setBounds(341, 360, 48, 15);
		contentPanel.add(lblTipo);
		
		rdbtnOperario = new JRadioButton("Operario");
		rdbtnOperario.setOpaque(false);
		rdbtnOperario.setBounds(378, 356, 78, 23);
		contentPanel.add(rdbtnOperario);
		
		rdbtnMinero = new JRadioButton("Minero");
		rdbtnMinero.setOpaque(false);
		rdbtnMinero.setBounds(468, 356, 109, 23);
		contentPanel.add(rdbtnMinero);
		
		lblTratamiento = new JLabel("Tratamientos:");
		lblTratamiento.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTratamiento.setBounds(314, 309, 83, 15);
		contentPanel.add(lblTratamiento);
		
		comboBox = new JComboBox();
		comboBox.setBackground(Color.GRAY);
		comboBox.setBounds(399, 305, 163, 23);
		contentPanel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"seleccione", "Neumoconiosis", "Vértigo", "Problemas_Respiratorios"}));
		
		lblDias = new JLabel("D\u00EDas de hospitalizaci\u00F3n:");
		lblDias.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDias.setBounds(324, 267, 161, 15);
		contentPanel.add(lblDias);
		
		txtMedicamentos = new JTextField();
		txtMedicamentos.setBounds(444, 228, 86, 21);
		contentPanel.add(txtMedicamentos);
		txtMedicamentos.setColumns(10);
		
		lblMedicamentos = new JLabel("Costo de medicamentos:");
		lblMedicamentos.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblMedicamentos.setBounds(314, 229, 146, 19);
		contentPanel.add(lblMedicamentos);
		
		txtMedicamento = new JTextField();
		txtMedicamento.setBounds(444, 264, 86, 21);
		contentPanel.add(txtMedicamento);
		txtMedicamento.setColumns(10);
		
		textAreaRegistro = new JTextArea();
		textAreaRegistro.setBounds(302, 424, 278, 146);
		contentPanel.add(textAreaRegistro);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTotal.setBounds(411, 398, 87, 15);
		contentPanel.add(lblTotal);
		
		llblIcono = new JLabel("");
		llblIcono.setHorizontalAlignment(SwingConstants.CENTER);
		llblIcono.setBackground(Color.WHITE);
		llblIcono.setOpaque(true);
		llblIcono.setIcon(new ImageIcon("C:\\Users\\santi\\Workspace Web\\Hospital\\src\\Imagenes\\LogoHospital.jfif"));
		llblIcono.setBounds(0, 0, 271, 87);
		contentPanel.add(llblIcono);
		
		lblBanner = new JLabel("");
		lblBanner.setOpaque(true);
		lblBanner.setIcon(new ImageIcon("C:\\Users\\santi\\Workspace Web\\Hospital\\src\\Imagenes\\banner.PNG"));
		lblBanner.setBounds(0, 0, 271, 581);
		contentPanel.add(lblBanner);
		{
			buttonPane = new JPanel();
			buttonPane.setBackground(new Color(105, 105, 105));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			btnRegistrar = new JButton("Registrar");
			buttonPane.add(btnRegistrar);
			btnRegistrar.addActionListener(this);
			{
				btnSalir = new JButton("Salir");
				btnSalir.setActionCommand("Cancel");
				buttonPane.add(btnSalir);
				btnSalir.addActionListener(this);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnSalir) {
			miCoordinador.SalirVentanaRegistro();
		}
		if(e.getSource()==btnRegistrar) {
			registrarPersona();
			textAreaRegistro.setText("Neumoconiosis: $500.000\n" + 
							"Vértigo: $300.000\n"+
							"Problemas respiratorios: $250.000\n"+
							"Dias de hospitalización: $80.000.\n"+
							"Total: "+calcularTotal(miPerson));
			
		}
		
	}

	private void registrarPersona() {
		miPerson = new PersonVO();
		
		miPerson.setNombreEmpresa(txtEmpresa.getText());
		miPerson.setNombre(txtNombre.getText());
		miPerson.setDocumentoPaciente(txtDocumento.getText());
		miPerson.setDireccion(txtDireccion.getText());
		miPerson.setNumeroTelefono(txtTelefono.getText());
		miPerson.setTratamiento(comboBox.getSelectedItem()+"");
		if(rdbtnMinero.isSelected()) {
			miPerson.setTipo(rdbtnMinero.getText());
		}
		if(rdbtnOperario.isSelected()) {
			miPerson.setTipo(rdbtnOperario.getText());
		}
		miPerson.setDias(Integer.parseInt(txtMedicamentos.getText()));
		miPerson.setMedicamento(Integer.parseInt(txtMedicamento.getText()));
		
		miCoordinador.guardarPersona(miPerson);
		
		calcularTotal(miPerson);
		
	}

	private double calcularTotal(PersonVO miPerson) {
		return miCoordinador.calcularTotal(miPerson);
	}




}