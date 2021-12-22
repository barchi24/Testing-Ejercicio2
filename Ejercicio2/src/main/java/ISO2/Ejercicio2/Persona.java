package ISO2.Ejercicio2;

public class Persona {
	private boolean enferma;
	private boolean contactosRecientes;
	private boolean sintomas;
	private boolean pasaporteCovid;
	private boolean profesionalImprescindible;
	private int edad;
	
	public Persona(int edad, boolean enferma, boolean contactosRecientes, boolean sintomas, boolean pasaporteCovid,
			boolean profesionalImprescindible) {
		this.edad = edad;
		this.enferma = enferma;
		this.contactosRecientes = contactosRecientes;
		this.sintomas = sintomas;
		this.pasaporteCovid = pasaporteCovid;
		this.profesionalImprescindible = profesionalImprescindible;
	}

	public boolean isEnferma() {
		return enferma;
	}

	public boolean isContactosRecientes() {
		return contactosRecientes;
	}

	public boolean isSintomas() {
		return sintomas;
	}

	public boolean isPasaporteCovid() {
		return pasaporteCovid;
	}

	public boolean isProfesionalImprescindible() {
		return profesionalImprescindible;
	}

	public int getEdad() {
		return edad;
	}
}
