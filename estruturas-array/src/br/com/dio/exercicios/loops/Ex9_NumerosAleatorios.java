package br.com.dio.exercicios.loops;

import java.util.Random;

public class Ex9_NumerosAleatorios {
    /*
     * Leia 20 numeros inteiros aleatorios (0 e 100) e armaze num vetor
     * Ao final mostre os numeros e seus sucessores
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];
        int numero;

        for (int i = 0; i < numerosAleatorios.length; i++){
            numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        for (int i : numerosAleatorios) {
            System.out.println("Numero: " + i);
        }
        for (int i : numerosAleatorios) {
            System.out.println("Sucessores: " + (++i));
        }
    }   
}
