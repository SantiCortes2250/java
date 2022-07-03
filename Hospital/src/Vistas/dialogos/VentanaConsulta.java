package Vistas.dialogos;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

import Controlador.Coordinador;
import Modelo.Procesos;
import Modelo.VO.PersonVO;

public class VentanaConsulta extends JDialog implements ActionListener{
	
	private Coordinador miCoordinador;

	private final JPanel contentPanel = new JPanel();
	private JButton btnSalir;
	private JLabel lblTitulo;
	private JLabel lblDocumento;
	private JTextField txtDocumentoPaciente;
	private JButton btnConsultar;
	
	private ArrayList<PersonVO> ListaPecientes;

	private Procesos myProcesses;
//	private JScrollPane scrollPane_1;
//	private JTextField textArea2;
	private JLabel lblNewLabel_2;
	private JTextField textField;

	private JTextArea textTodosPacientes;
	private JScrollPane scrollPane_1;

	private JTextArea textConsultaPacientes;
	private JLabel lblicono;
	private JLabel lblTodosPacientes;

	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	public VentanaConsulta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\santi\\Workspace Web\\Hospital\\src\\Imagenes\\LogoHospital.jfif"));
		setTitle("Hospital San Nicolas");
		setBounds(600, 120, 520, 395);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(176, 196, 222));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblTitulo = new JLabel("CONSULTAR PACIENTE");
			lblTitulo.setBounds(10, 11, 312, 46);
			lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 22));
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblTitulo);
		}
		{
			lblDocumento = new JLabel("Documento del paciente:");
			lblDocumento.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			lblDocumento.setBounds(10, 93, 158, 28);
			contentPanel.add(lblDocumento);
		}
		{
			txtDocumentoPaciente = new JTextField();
			txtDocumentoPaciente.setBounds(138, 97, 158, 21);
			contentPanel.add(txtDocumentoPaciente);
			txtDocumentoPaciente.setColumns(10);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 169, 227, 142);
		contentPanel.add(scrollPane);
		
		textTodosPacientes = new JTextArea();
		scrollPane.setViewportView(textTodosPacientes);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(247, 169, 247, 142);
		contentPanel.add(scrollPane_1);
		
		textConsultaPacientes = new JTextArea();
		scrollPane_1.setViewportView(textConsultaPacientes);
		
		lblicono = new JLabel("");
		lblicono.setIcon(new ImageIcon("C:\\Users\\santi\\Workspace Web\\Hospital\\src\\Imagenes\\LogoHospital.jfif"));
		lblicono.setBounds(314, 11, 180, 132);
		contentPanel.add(lblicono);
		
		lblTodosPacientes = new JLabel("Todos los Pacientes:");
		lblTodosPacientes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTodosPacientes.setBounds(20, 142, 134, 27);
		contentPanel.add(lblTodosPacientes);
		
		;
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(105, 105, 105));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			btnConsultar = new JButton("Consultar");
			buttonPane.add(btnConsultar);
			btnConsultar.addActionListener(this);
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
		
		if (e.getSource() == btnConsultar) {
			PersonVO myPerson=myProcesses.ObtenerPaciente(txtDocumentoPaciente.getText());
			
			if(myPerson!=null) {
				textConsultaPacientes.setText(myPerson+"");			
			}
		}
		if(e.getSource()== btnSalir) {
			miCoordinador.SalirVentanaConsulta();
		}
	}

	public void mandarProcesos(Procesos myProcesses) {
		this.myProcesses=myProcesses;
	}
	
	public void cargarDatos() {
		ListaPecientes = miCoordinador.llenado();
		llenar();
	}

	private void llenar() {
		int contador=0;
		String fila="";
		for (PersonVO personVO : ListaPecientes) {
			fila+="Paciente: "+ (contador+1)+"\n";
			fila+="\n";
			fila+="Documento: "+personVO.getDocumentoPaciente()+"\n";
			fila+="Nombre: "+personVO.getNombre()+"\n";
			fila+="Direccion: "+personVO.getDireccion()+"\n";
			fila+="Telefono: "+personVO.getNumeroTelefono()+"\n";
			fila+="Nombre de la empresa: "+personVO.getNombreEmpresa()+"\n";
			fila+="Tipo: "+personVO.getTipo()+"\n";
			fila+="Tratamiento: "+personVO.getTratamiento()+"\n";
			fila+="Dias de hospitalizacion: "+personVO.getDias()+"\n";
			fila+="Medicamentos: "+personVO.getMedicamento()+"\n";
			fila+="\n";
			fila+="****************************************" + "\n";
			fila+="\n";
			contador++;
			}
		textTodosPacientes.setText(fila);
	}
}
