package br.com.prenatal.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prenatal.entity.Estado;

@Service
public class EstadosService {

	@Autowired
	public SessionFactory sessionFactory;

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public List<Estado> buscarTodos() {
	
		return getCurrentSession()
				
				
				
				
				.createQuery("SELECT est FROM estado est").list();
	}

}
