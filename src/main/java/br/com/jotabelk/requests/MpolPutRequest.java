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
	// endereço
		private String endereco;
		private String complemento;
		private String numero;
		private String bairro;
		private String cidade;
		private String estado;
		private String cep;
		
		// dados pessoais
		private String nome;
		private String sexo;
		private String celular;
		private String email;
		private String dataNascimento;
		private String estadoCivil;
		private String nomeDoConjugue;
		private String profissao;
		private String pai;
		private String mae;
		private String identidade;
		private String origem;
		private String cpf;
		private String escolaridade;
		private String religiaoAnterior;
		private String dataDoBatismo;
		private String igrejaAnterior;
		private String cargo;
		private String recebidoPorCartaouAclamacao;
		private String batismoComEspiritoSanto;
		private String naturalidade;

	
}
