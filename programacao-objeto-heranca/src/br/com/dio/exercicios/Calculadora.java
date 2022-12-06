package br.com.dio.exercicios;

public class Calculadora implements OperacaoMatematica {
    
    @Override
    public double somar(double numero1, double numero2){
        return numero1 + numero2;
    };

    @Override
    public double subtrair(double numero1, double numero2){
        return numero1 - numero2;
    };

    @Override
    public double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    };

    @Override
    public double dividir(double numero1, double numero2){
        return numero1 / numero2;
    };

}
