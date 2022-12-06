package br.com.desafios;

import java.util.Scanner;

/*
Desafio
Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida. 

Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes. 

Logo, NÃO é um Palíndromo. 

Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.

Entrada
A entrada consiste em um palavra.

Saída
Para cada String informada, terá uma saída de valor Booleano: TRUE, caso a palavra seja um palíndromo, ou FALSE caso a palavra NÃO seja um palíndromo.
 */
public class Palindromo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String ePalindrome = "TRUE";
        String ePalindromeInvertida = "FALSE";

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.

        for (int i = 0; i < palavra.length() / 2; i++) {
            if(palavra.charAt(i) != palavra.charAt((palavra.length() - i) - 1)) ePalindrome = "FALSE";           
        }

        System.out.println(ePalindrome);

        String palavraInvertida = new StringBuffer(palavra).reverse().toString();

        if (palavra.equals(palavraInvertida)) ePalindromeInvertida = "TRUE";

        System.out.println(ePalindromeInvertida);
    }
}
