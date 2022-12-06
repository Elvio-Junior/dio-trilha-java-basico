package br.com.dio.exercicios.loops;
/*
 * Crie um vetor de 6 numeros inteiros e mostre na ordem inversa
 */
public class Ex7_OrdemInversa {
    
    public static void main(String[] args) {
        
        int[] vetorDeInteiros = {1, 2, 3, 4, 5, 6};

        for (int i = vetorDeInteiros.length -1; i >= 0; i--) {
            System.out.println(vetorDeInteiros[i]);
        }

    }
}
