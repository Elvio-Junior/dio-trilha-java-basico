package br.com.dio.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        
        // Criar Set
        // Set notas = new HashSet<>(); // antes do Java 5
        // Set<Double> notas = new HashSet<Double>(); // Depois do java 5 - Generics (<Double>)
        // Set<Double> notas = new HashSet<>(); // java 7  - Diamond Operator (<Double>)
        // Set<Double> notas = Set.of(1d, 7d);

        System.out.println("Crie um conjunto e adicione notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Exiba a posicao da nota 5.0. Não é possível pois Set não tem indice");
        System.out.println("Adicione na lista a nota 8.0 na posição 4. Não é possível pois Set não tem indice");
        System.out.println("Substitua a nota 5.0 pela nota 6.0. Não é possível pois Set não tem set");

        System.out.println("Confira se a nota 5.0 esta na lista -> " + notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada. Não é possível pois Set não tem indice");

        System.out.println("Exibir a menor nota -> " + Collections.min(notas));

        System.out.println("Exibir a maoir nota -> " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores -> " + soma);

        System.out.println("Exiba a media dos valores -> " + soma / notas.size());

        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas.toString());

        System.out.println("Remova a nota da posicao 0. Não é possível pois Set não tem indice");

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas.toString());

        System.out.println("Exiba todas as notas que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas.toString());

        System.out.println("Confira se a lista esta vazia -> " + notas.isEmpty());

    }
}
