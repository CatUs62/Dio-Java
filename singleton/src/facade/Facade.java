package facade;

import facade.sub.CepApi;
import facade.sub.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getApi().recuperarCidade(cep);
        String estado = CepApi.getApi().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
