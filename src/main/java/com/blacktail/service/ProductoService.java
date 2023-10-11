package com.blacktail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blacktail.model.Producto;
import com.blacktail.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> listarProductos() {
		return productoRepository.findAll();
	}
	
}
