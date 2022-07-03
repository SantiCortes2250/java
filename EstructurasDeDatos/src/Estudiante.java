
public class Estudiante {
​
	String doc;
	String nombre;
	double n1,n2,n3;
	double promedio;
	String resultado;
	
	public Estudiante() {
		doc="-111";
		nombre="Default";
	}
	
​
​
​
	public Estudiante(String doc, String nombre, double n1, double n2, double n3) {
		super();
		this.doc = doc;
		this.nombre = nombre;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
​
​
​
​
	public void imprimirResultados() {
		String msj="Estudiante: "+nombre+"\n";
		msj+="Promedio="+promedio+"\n";
		msj+="Resultado="+resultado+"\n";
		System.out.println(msj);
	}
​
​
	public void identificarse() {
		String mensaje="DATOS DEL ESTUDIANTE\n";
		mensaje+="Documento: "+doc+"\n";
		mensaje+="Nombre: "+nombre+"\n";
		mensaje+="Nota1: "+n1+", Nota2: "+n2+", Nota3: "+n3+"\n\n";
		System.out.println(mensaje);
	}
	
}
