package br.com.jotabelk.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.jotabelk.entities.Mpol;

public interface IMpolRepository extends CrudRepository<Mpol, Integer>{
	
	@Query("select e from Mpol e where e.cpf = :param1")
	Mpol findByCpf(@Param("param1") String cpf)throws Exception;
	
	@Query("select e from Mpol e where e.idCliente = :param1")
	Mpol findByidCliente(@Param("param1") Integer idCliente)throws Exception;
	

}
