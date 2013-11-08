package br.com.prenatal.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;

import br.com.prenatal.entity.user.model.User;

public interface UserDAO {
	public void saveUser(User user);
    public void deleteUser(User user);
    public List<User> find(Criterion criterion);
}
