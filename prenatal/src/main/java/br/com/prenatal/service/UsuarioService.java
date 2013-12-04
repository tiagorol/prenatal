package br.com.prenatal.service;

import javax.persistence.NoResultException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.prenatal.entity.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	public SessionFactory sessionFactory;

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Transactional(readOnly = true)
	public Usuario buscarPorEmailAtivo(String username) {
		
		 Query query = getCurrentSession().createQuery("SELECT usu FROM Usuario usu WHERE usu.email = :username");
		 
		 query.setParameter("username", username);
		
		return (Usuario) query.uniqueResult();
	}
}
