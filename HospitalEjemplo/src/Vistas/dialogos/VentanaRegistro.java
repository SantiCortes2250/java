package Vistas.dialogos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import Controlador.Coordinador;
import Modelo.Procesos;
import Modelo.VO.PersonVO;

public class VentanaRegistro extends JDialog implements ActionListener{
	
	private Coordinador myCoordinator;

	private final JPanel contentPanel = new JPanel();
	private JButton cancelButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtDocumento;
	private JButton btnConsultar;

	private Procesos myProcesses;

	private JTextArea textArea;
//	private JScrollPane scrollPane_1;
//	private JTextField textArea2;
	private JLabel lblNewLabel_2;
	
	public void setCoordinator(Coordinador myCoordinator) {
		this.myCoordinator = myCoordinator;
	}

	public VentanaRegistro() {
		setBounds(100, 100, 520, 395);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("CONSULTAR PACIENTE");
			lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(10, 12, 484, 46);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Documento del paciente:");
			lblNewLabel_1.setBounds(10, 93, 158, 28);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtDocumento = new JTextField();
			txtDocumento.setBounds(165, 97, 180, 21);
			contentPanel.add(txtDocumento);
			txtDocumento.setColumns(10);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 130, 484, 181);
		contentPanel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
//		scrollPane_1 = new JScrollPane();
//		scrollPane_1.setBounds(375, 130, 299, 181);
//		contentPanel.add(scrollPane_1);
		
//		textArea2 = new JTextField();
//		scrollPane_1.setViewportView(textArea2);
//		textArea2.setColumns(10);
		
		
		
//		lblNewLabel_2 = new JLabel("Todos los pacientes:");
//		lblNewLabel_2.setBounds(474, 100, 111, 15);
//		contentPanel.add(lblNewLabel_2);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			btnConsultar = new JButton("Consultar");
			buttonPane.add(btnConsultar);
			btnConsultar.addActionListener(this);
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
		
		if (e.getSource() == btnConsultar) {
			PersonVO myPerson=myProcesses.ObtenerPaciente(txtDocumento.getText());
			
			if(myPerson!=null) {
				textArea.setText(myPerson+"");			
			}
		}
		if(e.getSource()== cancelButton) {
			myCoordinator.hideWindowQuery();
		}
	}

	public void mandarProcesos(Procesos myProcesses) {
		this.myProcesses=myProcesses;
	}
}
