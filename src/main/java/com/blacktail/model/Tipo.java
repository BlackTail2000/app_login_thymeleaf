package com.blacktail.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_tipos")
public class Tipo {

	@Id
	private int idtipo;
	@Column(length = 15)
	private String descripcion;
	
	@OneToMany(mappedBy = "tipo")
	private List<Usuario> usuarios;
}
