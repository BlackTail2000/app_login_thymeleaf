package com.blacktail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blacktail.model.Usuario;
import com.blacktail.service.IUsuarioService;

@Controller
@RequestMapping("/Usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("usuarioLogin", new Usuario());
		return "login";
	}
	
	@PostMapping("/validarUsuario")
	public String validarUsuario(@ModelAttribute("usuarioLogin") Usuario usuarioRecuperado, Model model) {
		Usuario usuarioBuscado = usuarioService.loginUsuario(usuarioRecuperado.getUsrUsua(), usuarioRecuperado.getClaUsua());
		
		if(usuarioBuscado==null) {
			model.addAttribute("mensajeError", "Usuario y/o claves incorrectas");
			model.addAttribute("usuarioLogin", new Usuario());
			return "login";
		} else {
			return "redirect:/Producto/Index/" + usuarioBuscado.getCodUsua();
		}
	}
}
