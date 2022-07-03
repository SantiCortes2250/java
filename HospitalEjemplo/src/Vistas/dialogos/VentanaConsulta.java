package Vistas.dialogos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import Controlador.Coordinador;
import Modelo.VO.PersonVO;

public class VentanaConsulta extends JDialog implements ActionListener{
	
	private Coordinador myCoordinator;

	private final JPanel contentPanel = new JPanel();
	private JButton cancelButton;
	private JPanel buttonPane;
	private JTextField txtNomEmpresa;
	private JTextField txtDocumento;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtDias;
	private Container lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JRadioButton rdbtnOperario;
	private JRadioButton rdbtnMinero;
	private JLabel lblNewLabel_7;
	private JComboBox comboBox;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField txtMedicamento;
	private JButton btnRegistrar;
	private JTextArea textArea;
	private PersonVO miPerson;
	
	public void setCoordinator(Coordinador myCoordinator) {
		this.myCoordinator = myCoordinator;
	}

	public VentanaConsulta() {
		setBounds(100, 100, 516, 505);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("Registrar Paciente");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		
		lblNewLabel.setBounds(10, 12, 480, 36);
		contentPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombre Empresa:");
		lblNewLabel_1.setBounds(10, 64, 117, 23);
		contentPanel.add(lblNewLabel_1);
		
		txtNomEmpresa = new JTextField();
		txtNomEmpresa.setBounds(116, 65, 176, 21);
		contentPanel.add(txtNomEmpresa);
		txtNomEmpresa.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setBounds(302, 68, 87, 15);
		contentPanel.add(lblNewLabel_2);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(378, 65, 86, 21);
		contentPanel.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setBounds(10, 110, 117, 15);
		contentPanel.add(lblNewLabel_3);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(68, 107, 189, 21);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_4.setBounds(281, 110, 78, 15);
		contentPanel.add(lblNewLabel_4);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(342, 107, 130, 21);
		contentPanel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Telefono:");
		lblNewLabel_5.setBounds(10, 156, 81, 15);
		contentPanel.add(lblNewLabel_5);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(78, 153, 117, 21);
		contentPanel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Tipo:");
		lblNewLabel_6.setBounds(10, 196, 48, 15);
		contentPanel.add(lblNewLabel_6);
		
		rdbtnOperario = new JRadioButton("Operario");
		rdbtnOperario.setBounds(38, 192, 109, 23);
		contentPanel.add(rdbtnOperario);
		
		rdbtnMinero = new JRadioButton("Minero");
		rdbtnMinero.setBounds(38, 222, 109, 23);
		contentPanel.add(rdbtnMinero);
		
		lblNewLabel_7 = new JLabel("Tratamientos:");
		lblNewLabel_7.setBounds(228, 156, 83, 15);
		contentPanel.add(lblNewLabel_7);
		
		comboBox = new JComboBox();
		comboBox.setBounds(321, 152, 130, 23);
		contentPanel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"seleccione", "Neumoconiosis", "Vértigo", "Problemas_Respiratorios"}));
		
		lblNewLabel_8 = new JLabel("D\u00EDas de hospitalizaci\u00F3n:");
		lblNewLabel_8.setBounds(228, 196, 161, 15);
		contentPanel.add(lblNewLabel_8);
		
		txtDias = new JTextField();
		txtDias.setBounds(361, 193, 86, 21);
		contentPanel.add(txtDias);
		txtDias.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Costo de medicamentos:");
		lblNewLabel_9.setBounds(228, 226, 146, 19);
		contentPanel.add(lblNewLabel_9);
		
		txtMedicamento = new JTextField();
		txtMedicamento.setBounds(378, 224, 86, 21);
		contentPanel.add(txtMedicamento);
		txtMedicamento.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(38, 293, 426, 128);
		contentPanel.add(textArea);
		
		JLabel lblNewLabel_10 = new JLabel("TOTAL:");
		lblNewLabel_10.setBounds(224, 266, 48, 15);
		contentPanel.add(lblNewLabel_10);
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			btnRegistrar = new JButton("Registrar");
			buttonPane.add(btnRegistrar);
			btnRegistrar.addActionListener(this);
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(this);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==cancelButton) {
			myCoordinator.hideWindowLog();
		}
		if(e.getSource()==btnRegistrar) {
			registrarPersona();
			textArea.setText("Neumoconiosis: $500.000\n" + 
							"Vértigo: $300.000\n"+
							"problemas respiratorios: $250.000\n"+
							"día de hospitalización: $80.000.\n"+
							"Total de costos: "+calcularTotal(miPerson));
		}
		
	}

	private void registrarPersona() {
		miPerson = new PersonVO();
		
		miPerson.setCompanyName(txtNomEmpresa.getText());
		miPerson.setName(txtNombre.getText());
		miPerson.setPatientDocument(txtDocumento.getText());
		miPerson.setAddress(txtDireccion.getText());
		miPerson.setTelephoneNumber(txtTelefono.getText());
		miPerson.setTratament(comboBox.getSelectedItem()+"");
		if(rdbtnMinero.isSelected()) {
			miPerson.setType(rdbtnMinero.getText());
		}
		if(rdbtnOperario.isSelected()) {
			miPerson.setType(rdbtnOperario.getText());
		}
		miPerson.setDays(Integer.parseInt(txtDias.getText()));
		miPerson.setMedicine(Integer.parseInt(txtMedicamento.getText()));
		
		myCoordinator.guardarPersona(miPerson);
		
		calcularTotal(miPerson);
		
	}

	private double calcularTotal(PersonVO miPerson) {
		return myCoordinator.calcularTotal(miPerson);
	}
}
