package br.com.desafios;
/*
Desafio
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

Entrada
A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 

Saída
A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
 */
import java.util.Scanner;

public class SomaMultiplos {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        int resultado = 0, multiplo = 0;

        for (int i=1;  multiplo < N; i++) {
            multiplo = A * i;
            resultado = resultado + multiplo;
        }
        System.out.println(resultado);
    }
}
