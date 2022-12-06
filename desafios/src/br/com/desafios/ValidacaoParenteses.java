package br.com.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Desafio
Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida. 

Entrada
Uma string é considerada válida se:

Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida. 

Saída
A saída corresponde a um valor Booleano como no exemplo abaixo:
 */
public class ValidacaoParenteses {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
        boolean ehValido = false;
        List<String> caracteresValidos = new ArrayList<>() {
            {
                add("()");
                add("[]");
                add("{}");
            }
        };

        if (s == null || s.isEmpty()) {
            ehValido = true;
        }
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length()-1));
    
            String caracteresString = sb.toString();
            ehValido = caracteresValidos.contains(caracteresString);
        }

        return ehValido;
    }
}
