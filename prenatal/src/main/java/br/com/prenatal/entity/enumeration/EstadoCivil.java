package br.com.prenatal.entity.enumeration;

public enum EstadoCivil {
	SOLTEIRO, CASADO, DIVORCIADO, VIUVO;
	
	public String toString() {
		switch (this) {
		case SOLTEIRO:	
			
			
			return "Solteiro";
		case CASADO:			
			return "Casado";
		case DIVORCIADO:			
			return "Divorciado";
		case VIUVO:			
			return "Viuvo";
		default:
			return null;
		}
	};
}
 