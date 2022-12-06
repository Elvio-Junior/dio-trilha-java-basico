package dio.firstwebapi.handler;

public class CampoObrigatorioException extends BusinessException {

    public CampoObrigatorioException(String campo) {
        super("O campo %s e obrigatorio", campo);
        //TODO Auto-generated constructor stub
    }

    
}
