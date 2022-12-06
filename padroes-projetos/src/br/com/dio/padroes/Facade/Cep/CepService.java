package br.com.dio.padroes.Facade.Cep;

public class CepService {

    private static CepService instancia = new CepService();

    private CepService() {
        super();
    }
    
    public static CepService getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Franca";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }

}
