package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Ler um vetor de 6 caracteres
 * diga quantas consoantes foram lidas
 * imprimir as consoantes
 */
public class Ex8_Consoantes {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] vetor = new String[6];
        int quantidadesConsoantes = 0;
        int count = 0;

        do {
            System.out.print("Digite o caracter: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))
               ) {
                vetor[count] = letra;
                quantidadesConsoantes++;
               }
            count++;

        } while (count < vetor.length);

        for (String consoante : vetor) {
            if (consoante != null) System.out.println(consoante);
        }
        
        System.out.println("Quantidade de consoantes: " + quantidadesConsoantes);
    }
}
