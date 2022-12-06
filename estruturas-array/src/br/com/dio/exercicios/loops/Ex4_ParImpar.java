package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N numeros inteiros
 * Calcule e mostre a qtde de numeros pares e impares
 */
public class Ex4_ParImpar {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int count = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int numero;

        System.out.println("Digite a quantidade de numeros a serem digitados: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

           if (numero % 2 == 0) quantidadePares++;
           else quantidadeImpares++;
           
           count++;
        } while (count < quantidadeNumeros);
    
        System.out.println("Quantidade de pares: " + quantidadePares);
        System.out.println("Quantidade de Impares: " + quantidadeImpares);
    }
}
