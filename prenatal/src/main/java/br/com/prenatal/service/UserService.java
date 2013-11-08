package br.com.prenatal.service;

import br.com.prenatal.entity.user.model.User;

public interface UserService {	
    public void saveUser(User user);
    public void deleteUser(String username);
    public User findByUsername(String username);
}
