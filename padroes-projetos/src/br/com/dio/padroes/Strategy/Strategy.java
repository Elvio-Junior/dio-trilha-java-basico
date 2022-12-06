package br.com.dio.padroes.Strategy;

public class Strategy {
    
    public static void main(String[] args) {
        
        ComportamentoNormal normal = new ComportamentoNormal();
        ComporamentoDefensivo defensivo = new ComporamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
    }
}
