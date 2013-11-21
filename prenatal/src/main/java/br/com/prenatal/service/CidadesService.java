package br.com.prenatal.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.prenatal.entity.Cidade;

@Service
public class CidadesService {

	@Autowired
	public SessionFactory sessionFactory;

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Cidade> buscarTodas() {
		return getCurrentSession().createQuery("SELECT est FROM Cidade est").list();
	}

}
