package br.com.prenatal.service;

import java.util.List;

import org.hibernate.Query;
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
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Pendencias> buscarTodos() {
		return getCurrentSession().createQuery("SELECT pen FROM Pendencias pen").list();
	}
	@Transactional
	public void removerServive(Long id) {
		Query query = getCurrentSession().createQuery("DELETE FROM Pendencias WHERE id = :id");
        query.setParameter("id", id);
		query.executeUpdate();
				
	}
	@Transactional
	public void editarService(Pendencias pendencias){
		getCurrentSession().saveOrUpdate(pendencias);
	}
	
  
}
