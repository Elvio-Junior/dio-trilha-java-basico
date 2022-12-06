package br.com.desafios;

import java.util.Scanner;

/*
Descrição
Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   

Entrada
A Entrada será composta por um número inteiro, N. 

Saída
Será  impresso o somatório de N até 0, como no exemplo a baixo: 
 */
public class ChamadaRecursiva {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int N = numero.nextInt();

        //TODO: Imprima o somatório de N (utilize o método "somatorio").
        int resultado = somatorio(N);
        
        System.out.println(resultado);
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    } 
}
