package br.com.dio.exercicios;

public class Main {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.setCapacidadeTanque(50);

        carro.setModelo("Onix");

        carro.setCor("Preto");

        System.out.println("Carro. Modelo: " + carro.getModelo() + ". Cor: " + carro.getCor() + ". Tanque: " + carro.getCapacidadeTanque());

        double encherTanque = carro.calcularValorEncherTanque(4.64);

        System.out.println("Valor para encher o tanque é de R$ " + encherTanque);

        Carro carro1 = new Carro("Branco", "Gol", 40);

        System.out.println("Carro. Modelo: " + carro1.getModelo() + ". Cor: " + carro1.getCor() + ". Tanque: " + carro1.getCapacidadeTanque());

        encherTanque = carro1.calcularValorEncherTanque(4.64);

        System.out.println("Valor para encher o tanque é de R$ " + encherTanque);
    }
}
