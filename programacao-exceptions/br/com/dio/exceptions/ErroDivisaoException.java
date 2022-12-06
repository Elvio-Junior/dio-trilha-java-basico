public class ErroDivisaoException extends Exception {
    
    private int numerador;
    private int denominador;
    public ErroDivisaoException(String message, int numerador, int denominador) {
        super(message + "Numeradpor: " + numerador + ". Denominador" + denominador);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    
}
