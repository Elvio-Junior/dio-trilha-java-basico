package br.com.desafios;

import java.util.Scanner;

/*
Desafio
Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz". 

Entrada
Você receberá um número onde: 
Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ; 
Se o número for apenas múltiplo de 3 -> "Fizz" ; 
Se o número for apenas múltiplo de 5 -> "Buzz"; 
Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 

Saída
Retorne a palavra correta de acordo com o seu múltiplo. Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme exemplo abaixo:
 */
public class FizzBuzz {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        final int TRES = 3;
        final int CINCO = 5;
        
        boolean eMultiploDeTres = verificarNumeroMultiplo(num, TRES);
        
        boolean eMultiploDeCinco = verificarNumeroMultiplo(num, CINCO);

        String verificaMultiplo = verificarMultiplo(eMultiploDeTres, eMultiploDeCinco, num);

        System.out.println(verificaMultiplo);

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        
    }
    static boolean verificarNumeroMultiplo(int numero, int multiplo) {
        boolean eMultiplo = (numero % multiplo == 0) ? true : false;

        return eMultiplo;
      }

      static String verificarMultiplo(boolean multiploDeTres, boolean multiploDeCinco, int numero) {
        String multiplo = Integer.toString(numero);
        
        if (multiploDeTres && multiploDeCinco) {
            multiplo = "FizzBuzz";
        }
        if (multiploDeTres && !multiploDeCinco) {
            multiplo = "Fizz";
        }
        if (!multiploDeTres && multiploDeCinco) {
            multiplo = "Buzz";
        }
        return multiplo;
      }
}
