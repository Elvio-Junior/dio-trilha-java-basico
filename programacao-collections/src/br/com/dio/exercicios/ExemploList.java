package br.com.dio.exercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    
    public static void main(String[] args) {

        // Criar o List
        // List notas = new ArrayList<>(); // Antes do Java 5
        // List<Double> notas = new ArrayList<Double>(); // Depois do java 5 - Generics (<Double>)
        // List<Double> notas = new ArrayList<>(); // java 7  - Diamond Operator (<Double>)

        // Errado- Progrmar via interface e não pela implementação
        // ArrayList<Double> notas = new ArrayList<>();

        // Inicialização
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d));

        // Valido porem imutavel
        //List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d);

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Exibe a posição da nota 5.0 -> " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 esta na lista -> " + notas.contains(5d));

        System.out.println("Exiba todas as notas que foram informadas");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

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

        System.out.println("Remova a nota da posicao 0");
        notas.remove(0);
        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7 e exiba a lista");

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas.toString());

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas.toString());

        System.out.println("Confira se a lista esta vazia -> " + notas.isEmpty());

    }
}
