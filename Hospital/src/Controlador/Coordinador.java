package Controlador;

import java.util.ArrayList;

import Modelo.*;
import Modelo.VO.*;
import Vistas.dialogos.*;
import Vistas.ventanas.*;

public class Coordinador {
	
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaRegistro miVentanaRegistro;
	private VentanaConsulta miVentanaConsulta;
	private Procesos misProcesos;
	

	
	
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}

	public void setMiVentanaRegistro(VentanaRegistro miVentanaRegistro2) {
		this.miVentanaRegistro = miVentanaRegistro2;
	}

	public void setMiVentanaConsulta(VentanaConsulta miVentanaConsulta2) {
		this.miVentanaConsulta = miVentanaConsulta2;
	}

	public void setMisProcesos(Procesos misProcesos) {
		this.misProcesos = misProcesos;
	}

	public void MostrarVentanaPrincipal() {
		miVentanaPrincipal.setVisible(true);
	}

	
	public void MostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);
		
	}
	
	public void MostrarVentanaConsulta() {
		miVentanaConsulta.setVisible(true);
		miVentanaConsulta.cargarDatos();
	}
	

	public void SalirVentanaRegistro() {
		miVentanaRegistro.setVisible(false);
		
	}

	public void SalirVentanaConsulta() {
		miVentanaConsulta.setVisible(false);
	}

	public void guardarPersona(PersonVO miPerson) {
		misProcesos.guardarPersona(miPerson);
	}

	public double calcularTotal(PersonVO miPerson) {
		return misProcesos.calcularTotal(miPerson);
	}
	
	public ArrayList<PersonVO> llenado() {
		return misProcesos.llenado();
	}
	

	

}
