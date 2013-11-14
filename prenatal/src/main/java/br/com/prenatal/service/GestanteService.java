package br.com.prenatal.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prenatal.entity.Gestante;

@Service
public class GestanteService {
	
	@Autowired
	public SessionFactory sessionFactory;

	public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
	
	public Gestante salvar(Gestante gestante) {
		getCurrentSession().saveOrUpdate(gestante);
		return gestante;
	}
	

}
