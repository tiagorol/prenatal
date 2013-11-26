package br.com.prenatal.entity.enumeration;

public enum EstadoCivil {
	SOLTEIRO("Solteiro"), CASADO("Casado"), DIVORCIADO("Divorciado"), VIUVO("Viuvo");
	
	private final String estadoCivil;
	
	private EstadoCivil(String estadoCivil){		
		this.estadoCivil = estadoCivil;
	}
	
	public String getEstadoCivil(){
		return estadoCivil;
	}
}
 