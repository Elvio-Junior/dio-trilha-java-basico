package br.com.dio.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemploStreamApi {
    public static void main(String[] args) {
        
        List<String> numerosAleatorios =
            Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");


        System.out.println("Imprimir todos os elementos dessa lista de String");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                // TODO Auto-generated method stub
                System.out.println(s);
            }
            
        });

        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros e coloque dentro de um Set");
        numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet())
            .forEach(System.out::println);


        System.out.println("Transforme esta lista de string em lista de int");
        numerosAleatorios.stream()
            .map(s -> Integer.parseInt(s))
            .collect(Collectors.toList())
            .forEach(System.out::println);

        numerosAleatorios.stream()
            .map(Integer::parseInt);


        System.out.println("Pegue os numeros pares e maiores que 2 e coloque numa lista");
        List<String> numerosAleatorios2 =
            Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        List<Integer> paresMaioresQueDois = numerosAleatorios2.stream()
            .map(Integer::parseInt)
            .filter(i -> (i % 2 == 0 && i > 2))
            .collect(Collectors.toList());
        System.out.println(paresMaioresQueDois);

        System.out.println("Mostre a media dos numeros");
        List<String> numerosAleatorios3 =
            Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        OptionalDouble mediaNumeros = numerosAleatorios3.stream()
            .mapToInt(Integer::parseInt)
            .average();
            
        System.out.println(mediaNumeros);

        System.out.println("Remova os valores impares");
        List<String> numerosAleatorios4 =
            Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        List<Integer> numerosAleatoriosInteiros4 = numerosAleatorios4
            .stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        numerosAleatoriosInteiros4.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatorios4);
    }
}
