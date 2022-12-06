package br.com.dio.padroes.Facade;

import br.com.dio.padroes.Facade.Cep.CepService;
import br.com.dio.padroes.Facade.Crm.CrmService;

public class Facade {
    
    public void migrarCliente(String nome, String cep) {

        String cidade = CepService.getInstancia().recuperarCidade(cep);
        String estado = CepService.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
