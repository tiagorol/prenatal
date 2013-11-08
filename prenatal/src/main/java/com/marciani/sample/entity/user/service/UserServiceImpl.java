package com.marciani.sample.entity.user.service;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.marciani.sample.dao.UserDAO;
import com.marciani.sample.entity.user.model.User;
import com.marciani.sample.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional(readOnly = false)
	public void saveUser(User user) {
		userDAO.saveUser(user);		
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteUser(String username) {
		User user = findByUsername(username);
		userDAO.deleteUser(user);		
	}

	@Override
	@Transactional(readOnly = true)
	public User findByUsername(String username) {
		List<User> list = userDAO.find(Restrictions.eq("username", username));
		return list.get(0);
	}

}
