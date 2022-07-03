//Se crea la clase Principal
public class Principal {
	//La clase Principal se compone de 3 objetos diferentes de tipo Flecha
	
	Flecha flecha1,flecha2,flecha3;
	
	
//Se compone de un main que se encarga de instanciar un objeto de la misma clase para poder trabajar con objetos no estáticos.
	public static void main(String[] args) {
		Principal miPrincipal = new Principal();//instancia

	}
	//A la vez se cuenta con el constructor por defecto que permite crear las instancias
	//De cada objeto de tipo Flecha que estara encargada de llamar cada metodos de la clase Flecha para ser ejecutados.
	
	public Principal() {
		flecha1= new Flecha();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		
		
		flecha2= new Flecha();
		flecha2.color = "rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3 = new Flecha();
		flecha3.color = "negro";
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
	}

}
