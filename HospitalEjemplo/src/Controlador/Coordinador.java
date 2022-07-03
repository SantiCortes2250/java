package Controlador;

import Modelo.*;
import Modelo.VO.*;
import Vistas.dialogos.*;
import Vistas.ventanas.*;

public class Coordinador {
	
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaRegistro miVentanaRegistro;
	private VentanaConsulta miVentanaConsulta;
	private Procesos misProcesos;
	
	public void setMyWindowMain(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	
	public void setMyQueryWindow(VentanaRegistro miVentanaRegistro) {
		this.miVentanaRegistro = miVentanaRegistro;
	}
	
	public void setMyLogWindow(VentanaConsulta miVentanaConsulta) {
		this.miVentanaConsulta = miVentanaConsulta;
	}
	
	public void setMyProcesses(Procesos misProcesos) {
		this.misProcesos = misProcesos;
	}
	
	
	public void showWindowMain() {
		miVentanaPrincipal.setVisible(true);
	}

	public void showLogWindow() {
		miVentanaConsulta.setVisible(true);
	}
	
	public void showQueryWindow() {
		miVentanaRegistro.setVisible(true);
	}
	

	public void hideWindowLog() {
		miVentanaConsulta.setVisible(false);
		
	}

	public void hideWindowQuery() {
		miVentanaConsulta.setVisible(false);
	}

	public void guardarPersona(PersonVO miPerson) {
		misProcesos.guardarPersona(miPerson);
	}

	public double calcularTotal(PersonVO miPerson) {
		return misProcesos.calcularTotal(miPerson);
	}


	

}
