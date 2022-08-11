package br.com.jotabelk.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "USUARIO")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDUSUARIO")
	private Integer idUsuario;
	
	@Column(name = "NOMESOCIAL", length = 150, nullable = false)
	private String nomesocial;
	
	@Column(name = "EMAIL", length = 100, nullable = false, unique = true)
	private String email;
	
	@Column(name = "SENHA", length = 40, nullable = false)
	private String senha;

}
