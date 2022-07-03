package Modelo.VO;

public class PersonVO {
	
	private String companyName;
	private String patientDocument;
	private String name;
	private String address;
	private String telephoneNumber;
	private String type;
	private String tratament;
	private int age;
	private int days;
	private int medicine;
	
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getPatientDocument() {
		return patientDocument;
	}
	
	public void setPatientDocument(String patientDocument) {
		this.patientDocument = patientDocument;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getTratament() {
		return tratament;
	}

	public void setTratament(String tratament) {
		this.tratament = tratament;
	}
	
	public int getMedicine() {
		return medicine;
	}

	public void setMedicine(int medicine) {
		this.medicine = medicine;
	}

	@Override
	public String toString() {
		return "Paciente "+ patientDocument + "="+ "Nombre de la empresa:" + companyName + "\n Documento del paciente=" + patientDocument + "\n Nombre=" + name
				+ "\n Dirección=" + address + "\n Número de teléfono=" + telephoneNumber + "\n Tipo=" + type + "\n Tratamiento="
				+ tratament + "\n Días=" + days + "\n costo de medicamentos=" + medicine;
	}

}
