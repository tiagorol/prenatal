package br.com.prenatal.entity.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = -7351729135012380019L;
	
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "senha")
	private String password;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	public User() {}	
	
	public User(String username, String password, String firstname, String lastname) {
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}	
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "User[" + username + " " + password + " " + firstname + " " + lastname + "]";
	}	
	
	@Override
    public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		 
        User user = (User) o;
 
        return username.equals(user.username);
    }
 
    @Override
    public int hashCode() {
        return 13 * username.hashCode();
    }

}
