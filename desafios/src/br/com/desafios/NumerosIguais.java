package br.com.desafios;
/*
Desafio
Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 

Entrada
As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros. 

Saída
A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,  retorne "Nao sao iguais!", sem as aspas.

 */
import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        int A, B;
        Scanner leitor = new Scanner(System.in);
        
        A = leitor.nextInt();
        B = leitor.nextInt();

        if (A == B) {
          System.out.print("Sao iguais!");
        } else {
          System.out.print("Nao sao iguais!");
        }
    }
}