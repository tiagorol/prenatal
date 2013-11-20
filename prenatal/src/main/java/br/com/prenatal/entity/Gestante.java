package br.com.prenatal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.prenatal.entity.enumeration.EstadoCivil;
import br.com.prenatal.entity.enumeration.GrauEscolaridade;
import br.com.prenatal.entity.user.model.BaseEntity;

@Entity
@SequenceGenerator(name = "SEQUENCE", sequenceName = "gestante_id_seq")
public class Gestante extends BaseEntity {

	private static final long serialVersionUID = 438924673907489293L;

	@NotNull
	@Size(min = 2, max = 80)
	private String nome;

	@NotNull
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "estado_civil")
	private EstadoCivil estadoCivil;

	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private GrauEscolaridade escolaridade;

	@NotNull
	@Size(min = 2, max = 255)
	private String profissao;

	@NotNull
	@Size(min = 2, max = 255)
	private String bairro;

	@NotNull
	@Size(min = 2, max = 255)
	private String logradouro;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private Estado estado;

	@NotNull
	@Size(min = 11, max = 15)
	private String cpf;

	@NotNull
	@Size(max = 20)
	private String rg;

	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private Cidade cidade;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public GrauEscolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(GrauEscolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	
}
