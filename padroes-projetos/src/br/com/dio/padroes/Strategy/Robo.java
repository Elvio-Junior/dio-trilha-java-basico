package br.com.dio.padroes.Strategy;

public class Robo {
/*
 * Polimorfismo
 */
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
    
}
