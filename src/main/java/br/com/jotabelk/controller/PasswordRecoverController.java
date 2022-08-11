package br.com.jotabelk.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.jotabelk.repositories.IUsuarioRepository;
import br.com.jotabelk.requests.PasswordRecoverPostRequest;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data // criado setters e getters para o usuarioRepository.
@Transactional
@Controller
public class PasswordRecoverController {

	private static final String ENDPOINT = "/api/password-recover";

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@ApiOperation("Método para realizar a recuperação da senha do usuário.")
	@RequestMapping(value = ENDPOINT, method = RequestMethod.POST)
	public ResponseEntity<String> post(@RequestBody PasswordRecoverPostRequest request) {

		return null;
	}

}