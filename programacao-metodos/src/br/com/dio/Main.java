package br.com.dio;

public class Main {
    public static void main(String[] args) {
        
        Calculadora.somar(1, 2);

        Mensagem.obterMensagem(1);

        Emprestimo.calcular(5000.00, Emprestimo.getDuasParcelas());

        Quadrilatero.area(4);

        Quadrilatero.area(3, 2);

        Quadrilatero.area(2, 5, 3);

        System.out.println("Quadrilatero Retorno Quadrado "  + QuadrilateroRetorno.area(4));
    }
}
