package Controlador;

import Modelo.*;
import Vistas.dialogos.*;
import Vistas.ventanas.*;

public class Relaciones {
	
	public Relaciones() {
		
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		VentanaRegistro miVentanaRegistro = new VentanaRegistro();
		VentanaConsulta miVentanaConsulta = new VentanaConsulta();
		Procesos misProcesos = new Procesos();
		Coordinador miCoordinador =new Coordinador();
		
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miVentanaRegistro.setCoordinador(miCoordinador);
		miVentanaConsulta.setCoordinador(miCoordinador);
		misProcesos.setCoordinador(miCoordinador);
		miVentanaConsulta.mandarProcesos(misProcesos);
		
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiVentanaRegistro(miVentanaRegistro);
		miCoordinador.setMiVentanaConsulta(miVentanaConsulta);
		miCoordinador.setMisProcesos(misProcesos);
		
		miCoordinador.MostrarVentanaPrincipal();
		
	}

}