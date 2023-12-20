package edu.dio.padroes.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import edu.dio.padroes.model.Cliente;
import edu.dio.padroes.model.Endereco;
import edu.dio.padroes.repository.ClienteRepository;
import edu.dio.padroes.repository.EnderecoRepository;
import edu.dio.padroes.service.ClienteService;
import edu.dio.padroes.service.ViaCepService;


@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);

        if(clienteBd.isPresent()){
            inserir(cliente);
        }
    }

    @Override
    public Cliente buscarId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public Page<Cliente> buscarTodos(Pageable pageable) {
        return clienteRepository.listarComPage(pageable);
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void inserir(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();

        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);

            return novoEndereco;
        });

        cliente.setEndereco(endereco);
    }
    
}
