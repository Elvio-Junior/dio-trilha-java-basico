package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Geradro de tabuada
 * Usuario deve informar qual numero ele deseja ver a tabuada
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 */
public class Ex5_Tabuada {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int tabuada;
        System.out.println("Informe o numero da Tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i=0; i<=10; i++) {
            System.out.println(tabuada + " X " + i + " = " + tabuada * i);
        }
    }
}
