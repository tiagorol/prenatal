package com.marciani.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.marciani.sample.entity.user.model.Usuario;


@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	 @Autowired
	 private UsuarioService usuarioService;

	private static final String ADMIN_ROOT = "ADMIN_ROOT";

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = usuarioService.buscarPorEmailAtivo(username);

		if (usuario == null) {
			throw new UsernameNotFoundException("Usuario nao encontrado");
		}
		loadPermissoesUsuario(usuario);
		return usuario;
	}

	private void loadPermissoesUsuario(Usuario usuario) {

		List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
//		List<Permissao> listPermissaoUsuario = null;

//		if (usuario.getRoot()) {
//			listPermissaoUsuario = usuarioService.findAllPermissao();
//			listPermissaoUsuario.add(new Permissao(ADMIN_ROOT));
//		} else {
//			listPermissaoUsuario = usuarioService.findPermissaoByUsuario(usuario);
//		}
//
//		for (Permissao permissao : listPermissaoUsuario) {
//			grantedAuthorities.add(new SimpleGrantedAuthority(permissao.getChave()));
//		}

		usuario.setAuthorities(grantedAuthorities);
	}
}
