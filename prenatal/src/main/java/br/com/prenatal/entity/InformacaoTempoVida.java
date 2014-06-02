package br.com.prenatal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.prenatal.entity.user.model.BaseEntity;

@Entity
@Table(name="informacao_tempo_vida")
@SequenceGenerator(name = "SEQUENCE", sequenceName = "informacao_tempo_vida_id_seq")
public class InformacaoTempoVida extends BaseEntity {

	private static final long serialVersionUID = 7889175566500659842L;

	@NotEmpty
	private String conteudo;

	@NotNull
	@Column(name = "quantidade_semanas")
	private Integer quantidadeSemanas;
	
	public InformacaoTempoVida(){
		
	}
	
public InformacaoTempoVida(Long id){
		setId(id);
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getQuantidadeSemanas() {
		return quantidadeSemanas;
	}

	public void setQuantidadeSemanas(Integer quantidadeSemanas) {
		this.quantidadeSemanas = quantidadeSemanas;
	}

	
}
