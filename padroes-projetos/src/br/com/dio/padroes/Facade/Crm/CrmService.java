package br.com.dio.padroes.Facade.Crm;

public class CrmService {

    private CrmService() {
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Crm Service - Cliente Salvo no Sistema de CRM");
        System.out.println(nome + " " + cep + " " + cidade + " " + estado);
    }
    
}
