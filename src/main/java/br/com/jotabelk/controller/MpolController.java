package br.com.jotabelk.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.jotabelk.entities.Mpol;
import br.com.jotabelk.repositories.IMpolRepository;
import br.com.jotabelk.requests.MpolPostRequest;
import br.com.jotabelk.requests.MpolPutRequest;
import io.swagger.annotations.ApiOperation;

@Transactional
@Controller
public class MpolController {

	private static final String ENDPOINT = "/api/mpol";
	@Autowired
	private IMpolRepository mpolRepository;

	@ApiOperation("Método para realizar o cadastro de uma pessoa.")
	@RequestMapping(value = ENDPOINT, method = RequestMethod.POST)

	public ResponseEntity<String> post(@RequestBody MpolPostRequest request) {

		try {
			// verificando se o cpf informado já pertence a alguma pessoa cadastrada
			if (mpolRepository.findByCpf(request.getCpf()) != null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body("O cpf '" + request.getCpf() + "' já está cadastrado no sistema, tente outro.");
			}

			Mpol mpol = new Mpol();
			
			mpol.setNome(request.getNome());
			mpol.setCpf(request.getCpf());
			// novos itens adcionados relaciconados ao cadastro dos membros
			mpol.setEndereco(request.getEndereco());
			mpol.setComplemento(request.getComplemento());
			mpol.setNumero(request.getNumero());
			mpol.setBairro(request.getBairro());
			mpol.setCidade(request.getCidade());
			mpol.setEstado(request.getCidade());
			mpol.setCep(request.getCep());
			mpol.setSexo(request.getSexo());
			mpol.setCelular(request.getCelular());
			mpol.setEmail(request.getEmail());
			mpol.setDataNascimento(request.getDataNascimento());
			mpol.setEstadoCivil(request.getEstadoCivil());
			mpol.setNomeDoConjugue(request.getNomeDoConjugue());
			mpol.setProfissao(request.getProfissao());
			mpol.setPai(request.getPai());
			mpol.setMae(request.getMae());
			mpol.setIdentidade(request.getIdentidade());
			mpol.setOrigem(request.getOrigem());
			mpol.setEscolaridade(request.getEscolaridade());
			mpol.setReligiaoAnterior(request.getReligiaoAnterior());
			mpol.setDataDoBatismo(request.getDataDoBatismo());
			mpol.setIgrejaAnterior(request.getIgrejaAnterior());
			mpol.setCargo(request.getCargo());
			mpol.setRecebidoPorCartaouAclamacao(request.getRecebidoPorCartaouAclamacao());
			mpol.setBatismoComEspiritoSanto(request.getBatismoComEspiritoSanto());
			mpol.setNaturalidade(request.getNaturalidade());

			mpolRepository.save(mpol);
			

			return ResponseEntity.status(HttpStatus.CREATED)
					.body("cadastrado com sucesso");
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}

	
//##############################################################################################################
	
	
	
	@ApiOperation("Método para realizar a atualização  dos dados de uma pessoa.")
	@RequestMapping(value = ENDPOINT, method = RequestMethod.PUT)
	public ResponseEntity<String> put(@RequestBody MpolPutRequest request) {

		try {

			// pesquisar a empresa pelo id
			Optional<Mpol> consulta = mpolRepository.findById(request.getIdCliente());

			if (consulta.isEmpty()) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body("Nenhuma pessoa foi encontrada, por favor verifique o id informado.");
			}

			// Mpol mpol = new Mpol();
			Mpol mpol = consulta.get();

			mpol.setNome(request.getNome());
			
			
			
			// novos itens adcionados relaciconados ao cadastro dos membros
			mpol.setCpf(request.getCpf());
		
			mpol.setEndereco(request.getEndereco());
			mpol.setComplemento(request.getComplemento());
			mpol.setNumero(request.getNumero());
			mpol.setBairro(request.getBairro());
			mpol.setCidade(request.getCidade());
			mpol.setEstado(request.getCidade());
			mpol.setCep(request.getCep());
			mpol.setSexo(request.getSexo());
			mpol.setCelular(request.getCelular());
			mpol.setEmail(request.getEmail());
			mpol.setDataNascimento(request.getDataNascimento());
			mpol.setEstadoCivil(request.getEstadoCivil());
			mpol.setNomeDoConjugue(request.getNomeDoConjugue());
			mpol.setProfissao(request.getProfissao());
			mpol.setPai(request.getPai());
			mpol.setMae(request.getMae());
			mpol.setIdentidade(request.getIdentidade());
			mpol.setOrigem(request.getOrigem());
			mpol.setEscolaridade(request.getEscolaridade());
			mpol.setReligiaoAnterior(request.getReligiaoAnterior());
			mpol.setDataDoBatismo(request.getDataDoBatismo());
			mpol.setIgrejaAnterior(request.getIgrejaAnterior());
			mpol.setCargo(request.getCargo());
			mpol.setRecebidoPorCartaouAclamacao(request.getRecebidoPorCartaouAclamacao());
			mpol.setBatismoComEspiritoSanto(request.getBatismoComEspiritoSanto());
			mpol.setNaturalidade(request.getNaturalidade());
			
			
			
			mpolRepository.save(mpol);

			return ResponseEntity.status(HttpStatus.CREATED).body("atualizado com sucesso");

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}

	}
	
//############################################################################################################

	@ApiOperation("Método para realizar a exclusão de uma pessoa.")
	@RequestMapping(value = ENDPOINT + "/{idCliente}", method = RequestMethod.DELETE)
	public ResponseEntity<String> delete(@PathVariable("idCliente") Integer idCliente) {

		try {
			// pesquisar a empresa pelo id
			Optional<Mpol> consulta = mpolRepository.findById(idCliente);

			if (consulta.isEmpty()) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body("Nenhuma pessoa foi encontrada, por favor verifique o id informado.");
			}

			Mpol mpol = consulta.get();
			mpolRepository.delete(mpol);

			return ResponseEntity.status(HttpStatus.OK).body("excluido com sucesso");

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
	
//###########################################################################################################	

	@ApiOperation("Método para consultar todos as pessoas cadastradas.")
	@RequestMapping(value = ENDPOINT, method = RequestMethod.GET)

	public ResponseEntity<List<Mpol>> getAll() {

		try {

			List<Mpol> mpol = (List<Mpol>) mpolRepository.findAll();

			return ResponseEntity.status(HttpStatus.OK).body(mpol);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	
//#########################################################################################################
	
	
	@ApiOperation("Método para consultar uma pessoa baseado  no ID (identificador).")
	@RequestMapping(value = ENDPOINT + "/{idCliente}", method = RequestMethod.GET)
	public ResponseEntity<Mpol> getById(@PathVariable("idCliente") Integer idCliente) {
		try {

			Optional<Mpol> consulta = mpolRepository.findById(idCliente);

			if (consulta.isPresent()) {

				Mpol mpol = consulta.get();
				return ResponseEntity.status(HttpStatus.OK).body(mpol);
			}

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}

	}

}
