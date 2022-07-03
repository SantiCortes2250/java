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



	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	public void guardarPersona(PersonVO miPersona) {
		ListaPecientes.add(miPersona);
		JOptionPane.showMessageDialog(null, "PERSONA REGISTRADA!!!!");
	}


	public double calcularTotal(PersonVO miPersona) {
		double costoTratamiento=0;
		String tipo=miPersona.getTipo();
		int dia=miPersona.getDias();
		double medicamentos=miPersona.getMedicamento();
		double totalDias=80000*dia;
		double total=0;
		double descuento=0;
		double totalTratamiento=0;
		
		switch (tipo) {
		case "Operario": {
			if(miPersona.getTratamiento().equals("Neumoconiosis")) {
				costoTratamiento=500000;
			}else if(miPersona.getTratamiento().equals("Vértigo")) {
				costoTratamiento=300000;
			}else if(miPersona.getTratamiento().equals("Problemas Respiratorios")) {
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
			if(miPersona.getTratamiento().equals("Neumoconiosis")) {
				costoTratamiento=500000;
				descuento=costoTratamiento*0.2;
				totalTratamiento=costoTratamiento-descuento;
			}else if(miPersona.getTratamiento().equals("Vértigo")) {
				costoTratamiento=300000;
				descuento=costoTratamiento*0.2;
				totalTratamiento=costoTratamiento-descuento;
			}else if(miPersona.getTratamiento().equals("Problemas_Respiratorios")) {
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
		PersonVO PersonaVO=null;
		for (PersonVO personVO : ListaPecientes) {
			if(personVO.getDocumentoPaciente().equals(doc)) {
				PersonaVO=personVO;
			}
		}
		return PersonaVO;

	}
	
	public PersonVO MostrarTotal() {
		PersonVO InfoTotal=null;
		for (PersonVO personVO : ListaPecientes) {
				InfoTotal=personVO;
			}
		
		return InfoTotal;
	}
	
	
	public ArrayList<PersonVO> llenado() {
		return ListaPecientes;
	}

}
