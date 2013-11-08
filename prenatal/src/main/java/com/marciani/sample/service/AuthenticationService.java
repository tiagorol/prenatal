package com.marciani.sample.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.marciani.sample.entity.user.model.Usuario;

@Component("authenticationService")
public class AuthenticationService implements Serializable {

	private static final long serialVersionUID = 873131988517615130L;
	
	@Autowired
	@Qualifier("authenticationManager")
	private AuthenticationManager authenticationManager;
	
	public boolean login(String username, String password) {
		try {
			Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			if (authenticate.isAuthenticated()) {
				SecurityContextHolder.getContext().setAuthentication(authenticate);
				return true;
			}
		} catch (AuthenticationException e) {
            return false;
		}
		return false;
	}

	public void logout() {
		SecurityContextHolder.getContext().setAuthentication(null);
	}
	
	public Usuario getUsuarioLogado(){
		return (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
	
	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}
}
