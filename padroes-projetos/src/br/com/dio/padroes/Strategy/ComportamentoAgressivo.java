package br.com.dio.padroes.Strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movimentação Agressiva");
        
    }
    
}
