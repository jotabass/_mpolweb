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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "MPOL")
public class Mpol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCliente")
	private Integer idCliente;
	
	@Column(name ="NOME", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "CPF", length = 20, nullable = false, unique = true)
	private String cpf;
	
	
	// endereço
	@Column(name ="ENDERECO", length = 300, nullable = false)
	private String endereco;
	@Column(name ="COMPLEMENTO", length = 20, nullable = false)
	private String complemento;
	@Column(name ="NUMERO", length = 10, nullable = false)
	private String numero;
	@Column(name ="BAIRRO", length = 50, nullable = false)
	private String bairro;
	@Column(name ="CIDADE", length = 50, nullable = false)
	private String cidade;
	@Column(name ="ESTADO", length = 50, nullable = false)
	private String estado;
	@Column(name ="CEP", length = 50, nullable = false)
	private String cep;
	
	// dados pessoais
	
	@Column(name ="SEXO", length = 50, nullable = false)
	private String sexo;
	@Column(name ="CELULAR", length = 50, nullable = false)
	private String celular;
	@Column(name ="EMAIL", length = 100, nullable = false, unique = true)
	private String email;
	@Column(name ="DATANASCIMENTO", length = 50, nullable = false)
	private String dataNascimento;
	@Column(name ="ESTADOCIVIL", length = 50, nullable = false)
	private String estadoCivil;
	@Column(name ="NOMEDOCONJUGUE", length = 50, nullable = false)
	private String nomeDoConjugue;
	@Column(name ="PROFISSAO", length = 50, nullable = false)
	private String profissao;
	@Column(name ="PAI", length = 100, nullable = false)
	private String pai;
	@Column(name ="MAE", length =100, nullable = false)
	private String mae;
	@Column(name ="IDENTIDADE", length = 50, nullable = false)
	private String identidade;
	@Column(name ="ORIGEM", length = 50, nullable = false)
	private String origem;
	@Column(name ="ESCOLARIDADE", length = 50, nullable = false)
	private String escolaridade;
	@Column(name ="RELIGIAOANTERIOR", length = 50, nullable = false)
	private String religiaoAnterior;
	@Column(name ="DATADOBATISMO", length = 50, nullable = false)
	private String dataDoBatismo;
	@Column(name ="IGREJAANTERIOR", length = 50, nullable = false)
	private String igrejaAnterior;
	@Column(name ="CARGO", length = 50, nullable = false)
	private String cargo;
	@Column(name ="RECEBIDOPORCARTAOUACLAMACAO", length = 50, nullable = false)
	private String recebidoPorCartaouAclamacao;
	@Column(name ="BATISMOCOMESPIRITOSANTO", length = 50, nullable = false)
	private String batismoComEspiritoSanto;
	@Column(name = "NATURALIDADE",length = 50, nullable = false)
	private String naturalidade;
}
