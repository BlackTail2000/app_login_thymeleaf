package com.blacktail.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproveedor;
	@Column(name = "nombre_rs", length = 45, nullable = false)
	private String nombreRs;
	@Column(length = 10, nullable = false)
	private String telefono;
	@Column(length = 45, nullable = false)
	private String email;
	
	@OneToMany(mappedBy = "proveedor")
	private List<Producto> productos;
}
