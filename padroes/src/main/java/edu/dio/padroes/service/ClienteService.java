package edu.dio.padroes.service;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import edu.dio.padroes.model.Cliente;

public interface ClienteService {
    Page<Cliente> buscarTodos(Pageable pageable);

    Cliente buscarId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
