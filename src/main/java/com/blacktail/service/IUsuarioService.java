package com.blacktail.service;

import com.blacktail.model.Usuario;

public interface IUsuarioService {

	Usuario loginUsuario(String usrUsua, String claUsua);
	Usuario buscarPorId(int codUsua);
}
