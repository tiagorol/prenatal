package br.com.prenatal.service;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.prenatal.entity.Gestante;

@Service
public class GestanteService {

	@Autowired
	public SessionFactory sessionFactory;

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public Gestante salvar(Gestante gestante) {
		getCurrentSession().saveOrUpdate(gestante.getUsuario());
		getCurrentSession().saveOrUpdate(gestante);
		return gestante;
	}

	public int calcularData() {
		
		return 0;
	}

}
