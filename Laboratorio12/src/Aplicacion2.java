//3. Aplicación orientada a objetos usando 2 clases.

//Se crea la clase Aplicacion2 
public class Aplicacion2 
//Esta clase esta encargada de crear un objeto
{

	public static void main(String[] args) 
	//Se crea el objeto rectangulo el cual llamara cada metodo de la clase Entidad para ser ejecutado.
	{
		Entidad    rectangulo;
		
		rectangulo  = new Entidad ();//instancia
		
		rectangulo.ingresarDatos ();
		rectangulo.calcularArea  ();
		
	}

}// Fin de la clase Aplicacion2
