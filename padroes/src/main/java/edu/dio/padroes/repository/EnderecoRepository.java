package edu.dio.padroes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.dio.padroes.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String>{
    
}
