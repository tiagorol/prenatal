package br.com.prenatal.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.prenatal.entity.Pendencias;

@Service
public class PendenciasService {
	
	@Autowired
	public SessionFactory sessionFactory;

	public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }	
	
	@Transactional
	public Pendencias salvar(Pendencias pendencias) {
		getCurrentSession().saveOrUpdate(pendencias);
		return pendencias;
	}
	

}
