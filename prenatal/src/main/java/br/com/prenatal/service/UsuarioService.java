package br.com.prenatal.service;

import org.springframework.stereotype.Service;

import br.com.prenatal.entity.Usuario;

@Service
public class UsuarioService {

	public Usuario buscarPorEmailAtivo(String username) {
		
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setEmail("teste@gmail.com");
		usuario.setSenha("123");
		
		return usuario;
	}

}
