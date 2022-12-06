package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 numeros
 * Informe o maior numero
 * Informe a média
 */
public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int somatorio = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count ++;
            if (numero >= maior) maior = numero;
            somatorio += numero;
        } while (count < 5);

        double media = somatorio / count;

        System.out.println("O maior numero e: " + maior);
        System.out.println("A media dos numeros e: " + media);

    }
}
