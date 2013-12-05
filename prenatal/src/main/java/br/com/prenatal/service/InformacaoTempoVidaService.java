package br.com.prenatal.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.prenatal.entity.InformacaoTempoVida;

@Service
public class InformacaoTempoVidaService {
	
	@Autowired
	public SessionFactory sessionFactory;

	public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }	
	
	@Transactional
	public InformacaoTempoVida salvar(InformacaoTempoVida informacaoTempoVida) {
		getCurrentSession().saveOrUpdate(informacaoTempoVida);
		return informacaoTempoVida;
	}
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<InformacaoTempoVida> buscarTodos() {
		return getCurrentSession().createQuery("SELECT ift FROM InformacaoTempoVida ift").list();
	}

}
