package br.com.jotabelk.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.jotabelk.entities.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {

	@Query("select u from Usuario u where u.email = :param2")
	Usuario findByEmail(@Param("param2") String email) throws Exception;

	@Query("select u from Usuario u where u.email = :param2 and u.senha = :param3")
	Usuario findByEmailAndSenha(@Param("param2") String email, @Param("param3") String senha) throws Exception;
}
