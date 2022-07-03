package Modelo;

import java.util.*;

import javax.swing.JOptionPane;

import Controlador.Coordinador;
import Modelo.VO.PersonVO;

public class Procesos {
	
	private Coordinador miCoordinador;
	
	ArrayList<PersonVO> ListaPecientes;
	
	public Procesos() {
		ListaPecientes = new ArrayList<PersonVO>();
	}



	public void setCoordinator(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	public void guardarPersona(PersonVO miPersona) {
		ListaPecientes.add(miPersona);
		JOptionPane.showMessageDialog(null, "Persona registrada con éxito");
	}


	public double calcularTotal(PersonVO miPersona) {
		double costoTratamiento=0;
		String tipo=miPersona.getType();
		int dia=miPersona.getDays();
		double medicamentos=miPersona.getMedicine();
		double totalDias=80000*dia;
		double total=0;
		double descuento=0;
		double totalTratamiento=0;
		
		switch (tipo) {
		case "Operario": {
			if(miPersona.getTratament().equals("Neumoconiosis")) {
				costoTratamiento=500000;
			}else if(miPersona.getTratament().equals("Vértigo")) {
				costoTratamiento=300000;
			}else if(miPersona.getTratament().equals("Problemas_Respiratorios")) {
				costoTratamiento=250000;
			}
			
			total=costoTratamiento+totalDias+medicamentos;
			break;
		}
		case "Minero":{
			double porcentajeDias=totalDias*0.2;
			double descuentosDias=totalDias-porcentajeDias;
			double porcentajeMedicamentos=medicamentos*0.2;
			double descuentosMedicamentos=medicamentos-porcentajeMedicamentos;
			if(miPersona.getTratament().equals("Neumoconiosis")) {
				costoTratamiento=500000;
				descuento=costoTratamiento*0.2;
				totalTratamiento=costoTratamiento-descuento;
			}else if(miPersona.getTratament().equals("Vértigo")) {
				costoTratamiento=300000;
				descuento=costoTratamiento*0.2;
				totalTratamiento=costoTratamiento-descuento;
			}else if(miPersona.getTratament().equals("Problemas_Respiratorios")) {
				costoTratamiento=250000;
				descuento=costoTratamiento*0.2;
				totalTratamiento=costoTratamiento-descuento;
			}
			
			total=totalTratamiento+descuentosDias+descuentosMedicamentos;
			break;
		}
		}
		
		return total;
	}


	public PersonVO ObtenerPaciente(String doc) {
		PersonVO Pvo=null;
		for (PersonVO personVO : ListaPecientes) {
			if(personVO.getPatientDocument().equals(doc)) {
				Pvo=personVO;
			}
		}
		return Pvo;

	}
	
//	public PersonVO imprimirInfoTotal() {
//		PersonVO infoTotal=null;
//		for (PersonVO personVO : patientsList) {
//			infoTotal=personVO;
//		}
//		return infoTotal;
//		
//	}

}
