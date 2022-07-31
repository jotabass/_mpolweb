package br.com.jotabelk.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MpolPutRequest {
	private Integer idCliente;
	private String nome;
	private String cpf;
}
