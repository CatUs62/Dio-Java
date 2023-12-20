package edu.dio.padroes.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.dio.padroes.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    Page<Cliente> listarComPage(Pageable pageable);
}
