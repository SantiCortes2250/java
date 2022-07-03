package Controlador;

import Modelo.*;
import Vistas.dialogos.*;
import Vistas.ventanas.*;

public class Relaciones {
	
	public Relaciones() {
		
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		VentanaConsulta miVentanaConsulta = new VentanaConsulta();
		VentanaRegistro miVentanaRegistro = new VentanaRegistro();
		Procesos misProcesos = new Procesos();
		Coordinador miCoordinador =new Coordinador();
		
		miVentanaPrincipal.setCoordinator(miCoordinador);
		miVentanaRegistro.setCoordinator(miCoordinador);
		miVentanaConsulta.setCoordinator(miCoordinador);
		misProcesos.setCoordinator(miCoordinador);
		miVentanaRegistro.mandarProcesos(misProcesos);
		
		miCoordinador.setMyWindowMain(miVentanaPrincipal);
		miCoordinador.setMyQueryWindow(miVentanaRegistro);
		miCoordinador.setMyLogWindow(miVentanaConsulta);
		miCoordinador.setMyProcesses(misProcesos);
		
		miCoordinador.showWindowMain();
		
	}

}
