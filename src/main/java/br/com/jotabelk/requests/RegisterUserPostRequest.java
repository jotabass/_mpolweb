package br.com.jotabelk.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class RegisterUserPostRequest {
	private String nomesocial;
	private String email;
	private String senha;

}
