package br.com.prenatal.entity.user.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.prenatal.dao.UserDAO;
import br.com.prenatal.entity.user.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	public SessionFactory sessionFactory;
	
	public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

	@Override
	public void saveUser(User user) {
		getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public void deleteUser(User user) {
		getCurrentSession().delete(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> find(Criterion criterion) {
		Criteria criteria = getCurrentSession().createCriteria(User.class);
		criteria.add(criterion);
		return criteria.list();
	}

}
