package br.com.prenatal.entity.user.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@SequenceGenerator(name = "SEQUENCE", sequenceName = "usuario_id_seq")
public class Usuario extends BaseEntity implements UserDetails{
	
	private static final long serialVersionUID = -3019482700805308903L;

	@NotNull
	@Size(min = 3, max = 40)
	private String senha;
	
	@Email
	@NotNull
	@Size(min = 1, max = 255)
	private String email;
	
	@NotNull
	private Boolean ativo;
	
	@NotNull
	private Boolean root;
	
	@Transient
	private Collection<GrantedAuthority> authorities;
	
	public Usuario() {
		super();
		this.ativo   = true;
		this.root    = false;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Boolean getRoot() {
		return root;
	}

	public void setRoot(Boolean root) {
		this.root = root;
	}
	
	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public String getPassword() {
		return this.senha;
	}

	public String getUsername() {
		return this.email;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return this.ativo;
	}

}
