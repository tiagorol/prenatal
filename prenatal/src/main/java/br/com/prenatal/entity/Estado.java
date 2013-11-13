package br.com.prenatal.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.prenatal.entity.user.model.BaseEntity;

@Entity
@SequenceGenerator(name = "SEQUENCE", sequenceName = "estado_id_seq")
public class Estado extends BaseEntity {

	private static final long serialVersionUID = -5517527173825644286L;

	@NotNull
	@Size(min = 3, max = 80)
	private String nome;

	@NotNull
	@Size(min = 2, max = 2)
	private String sigla;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
