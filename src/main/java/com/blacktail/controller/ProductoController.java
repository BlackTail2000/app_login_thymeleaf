package com.blacktail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blacktail.model.Producto;
import com.blacktail.model.Usuario;
import com.blacktail.service.IProductoService;
import com.blacktail.service.IUsuarioService;

@Controller
@RequestMapping("/Producto")
public class ProductoController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IProductoService productoService;

	@GetMapping("/Index/{codUsua}")
	public String Index(@PathVariable("codUsua") int codUsua, Model model) {
		
		Usuario usuarioLogueado = usuarioService.buscarPorId(codUsua);
		model.addAttribute("usuarioLogueado", usuarioLogueado);
		
		List<Producto> productos = productoService.listarProductos();
		model.addAttribute("listadoProductos", productos);
		
		return "Mantenimiento Productos";
	}
}
