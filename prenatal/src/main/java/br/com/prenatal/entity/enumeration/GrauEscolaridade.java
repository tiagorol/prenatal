package br.com.prenatal.entity.enumeration;

public enum GrauEscolaridade {
	
	ANALFABETO("Analfabeto"), FUNDAMENTAL_INCOMPLETO("Fundamental Incompleto"), FUNDAMENTAL_COMPLETO("Fundalmetal Completo"), MEDIO_INCOMPLETO("Medio Incompleto"), MEDIO_COMPLETO("Medio Completo"), SUPERIOR_INCOMPLETO("Superior Incompleto"), SUPERIOR_COMPLETO("Superior Completo"), MESTRADO("Mestrado"), DOUTORADO("Doutorado");
		
	private final String grauEscolaridade;
	
	private GrauEscolaridade(String grauEscolaridade){		
		this.grauEscolaridade = grauEscolaridade;
	}

	public String getGrauEscolaridade() {
		return grauEscolaridade;
	}	
}
 

