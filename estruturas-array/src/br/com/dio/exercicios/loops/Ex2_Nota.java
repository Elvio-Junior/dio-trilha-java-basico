package br.com.dio.exercicios.loops;

import java.util.Scanner;
import java.util.WeakHashMap;

/*
 * Programa que peça uma nota entre zero e dez
 * Mostre uma mensagem caso o valor seja invalido
 * continue pedindo até que usuário informe um valor valido
 */
public class Ex2_Nota {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nota;
        boolean validarNota = true;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota >10) {
            System.out.println("Nota invalida. Digite novamente: ");
            nota = scan.nextInt();
        }

        while(validarNota) {
            System.out.println("Nota: ");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida. Digite novamente");
            } else {
                validarNota = false;
            }
        }
    }
}
