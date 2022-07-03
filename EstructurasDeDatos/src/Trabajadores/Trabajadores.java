package Trabajadores;

public class Trabajadores {
	
	String documento;
	String nombre;
    int edad;
	int estrato;
	double salario;
	double salarioFinal;
	double Aumento;
	
	public void Trabajador() {
		nombre = "Pedro";
		documento = "1312312";
		edad = 24;
		
		
	}
	
	public void DatosTrabajador() {
		String mensaje="DATOS DEL TRABAJADOR\n";
		mensaje+="Documento: "+documento+"\n";
		mensaje+="Nombre: "+nombre+"\n";
		mensaje+="Edad: "+edad+"\n";
		mensaje+="Estrato: "+estrato+"\n";
		mensaje+="Salario Actual: "+salario+"\n";

		System.out.println(mensaje);
	}
	
	
	
	

		
		

	

}
