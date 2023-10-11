package com.blacktail.model;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	private int idcategoria;
	@Column(length = 45)
	private String descripcion;
}
