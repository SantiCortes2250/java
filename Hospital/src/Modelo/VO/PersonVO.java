package Modelo.VO;

public class PersonVO {
	
	private String NombreEmpresa;
	private String DocumentoPaciente;
	private String Nombre;
	private String Direccion;
	private String NumeroTelefono;
	private String Tipo;
	private String Tratamiento;
	private int Edad;
	private int dias;
	private int Medicamento;
	
	
	

	public String getNombreEmpresa() {
		return NombreEmpresa;
	}




	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}




	public String getDocumentoPaciente() {
		return DocumentoPaciente;
	}




	public void setDocumentoPaciente(String documentoPaciente) {
		DocumentoPaciente = documentoPaciente;
	}




	public String getNombre() {
		return Nombre;
	}




	public void setNombre(String nombre) {
		Nombre = nombre;
	}




	public String getDireccion() {
		return Direccion;
	}




	public void setDireccion(String direccion) {
		Direccion = direccion;
	}




	public String getNumeroTelefono() {
		return NumeroTelefono;
	}




	public void setNumeroTelefono(String numeroTelefono) {
		NumeroTelefono = numeroTelefono;
	}




	public String getTipo() {
		return Tipo;
	}




	public void setTipo(String tipo) {
		Tipo = tipo;
	}




	public String getTratamiento() {
		return Tratamiento;
	}




	public void setTratamiento(String tratamiento) {
		Tratamiento = tratamiento;
	}




	public int getEdad() {
		return Edad;
	}




	public void setEdad(int edad) {
		Edad = edad;
	}




	public int getDias() {
		return dias;
	}




	public void setDias(int dias) {
		this.dias = dias;
	}




	public int getMedicamento() {
		return Medicamento;
	}




	public void setMedicamento(int medicamento) {
		Medicamento = medicamento;
	}




	@Override
	public String toString() {
		return  "Nombre de la empresa: " + NombreEmpresa + "\n Documento del paciente: " + DocumentoPaciente + "\n Nombre: " + Nombre
				+ "\n Dirección: " + Direccion + "\n Número de teléfono: " + NumeroTelefono + "\n Tipo: " + Tipo + "\n Tratamiento: "
				+ Tratamiento + "\n Días: " + dias + "\n costo de medicamentos: " + Medicamento;
	}

}
