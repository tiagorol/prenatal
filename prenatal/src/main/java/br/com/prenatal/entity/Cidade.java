package br.com.prenatal.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import br.com.prenatal.entity.user.model.BaseEntity;

@Entity
@SequenceGenerator(name = "SEQUENCE", sequenceName = "cidade_id_seq")
public class Cidade extends BaseEntity {

	private static final long serialVersionUID = 6619860201836914384L;

	@NotNull
	@Size(min = 3, max = 255)
	private String nome;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private Estado estado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado () {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
