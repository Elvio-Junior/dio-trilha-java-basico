
public class Desafio4Strategy {
    
    private Multiplo multiplo;

    public Desafio4Strategy(Multiplo multiplo) {
        this.multiplo = multiplo;
    }

    public String verificaMultiplo(boolean multiploDeTres, boolean multiploDeCinco, int numero) {
        return multiplo.verificarMultiplo(multiploDeTres, multiploDeCinco, numero);
    }
    public static void main(String[] args) {
        
    }
}
