package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Leia um conjunto de 2 valores
 * Primeiro: Nome do Aluno
 * Segundo: Idade
 * Interrompe o programa quando digitar 0 no nome do aluno
 */
public class Ex1_NomeIdade {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        do {
            System.out.print("Nome: ");
            nome = scan.next();
    
            System.out.print("Idade: ");
            idade = scan.nextInt();
    
        } while (!nome.equals("0"));

        while(true) {
            System.out.print("Nome: ");
            nome = scan.next();
    
            if (nome.equals("0")) break;

            System.out.print("Idade: ");
            idade = scan.nextInt();     
        }
       
    }
}
