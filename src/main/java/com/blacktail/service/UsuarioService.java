package com.blacktail.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blacktail.model.Usuario;
import com.blacktail.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario loginUsuario(String usrUsua, String claUsua) {
		return usuarioRepository.findByUsrUsuaAndClaUsua(usrUsua, claUsua);
	}

	@Override
	public Usuario buscarPorId(int codUsua) {
		Usuario usuario = null;
		Optional<Usuario> optional = usuarioRepository.findById(codUsua);
		if(optional.isPresent())
			usuario = optional.get();
		return usuario;
	}
	
}
