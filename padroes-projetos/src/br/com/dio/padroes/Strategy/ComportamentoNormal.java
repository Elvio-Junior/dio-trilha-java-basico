package br.com.dio.padroes.Strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movimentação normal");
        
    }
    
}
