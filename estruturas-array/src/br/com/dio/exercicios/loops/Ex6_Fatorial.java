package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario
 * 5! = 120 (5 x 4 x 3 x 2 x 1)
 */
public class Ex6_Fatorial {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int calculaFatotial = 1;

        for(int i = fatorial; i >= 1; i--){
            calculaFatotial = calculaFatotial * i;
        }
        System.out.println("Fatorial de " + fatorial + "!: " + calculaFatotial);
    }
}
