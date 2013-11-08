package com.marciani.sample.service;

import com.marciani.sample.entity.user.model.User;

public interface UserService {	
    public void saveUser(User user);
    public void deleteUser(String username);
    public User findByUsername(String username);
}
