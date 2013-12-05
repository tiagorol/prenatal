package br.com.prenatal.entity;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import br.com.prenatal.entity.user.model.BaseEntity;

@Entity
@Table(name="pendencias")
@SequenceGenerator(name = "SEQUENCE", sequenceName = "pendencias_id_seq")
public class Pendencias extends BaseEntity {
	
	private static final long serialVersionUID = -5406567529471696640L;

	@NotNull
	private String titulo;

	@NotNull
	private Integer semana;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getSemana() {
		return semana;
	}

	public void setSemana(Integer semana) {
		this.semana = semana;
	}
		
}
