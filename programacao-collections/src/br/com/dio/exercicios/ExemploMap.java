package br.com.dio.exercicios;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExemploMap {
    public static void main(String[] args) {
        
        // Criar Map
        // Map carros = new HashMap<>(); // antes do Java 5
        // Map<String, Double> carros = new HashMap<>(); // Depois do java 5 - Generics (<Double>)
        // Map<String, Double> notas = new HashMap<>(); // java 7  - Diamond Operator (<Double>)
        // Map<String, Double> notas = Map.of("Gol", 14.4, "Uno", 17.2);

        System.out.println("Crie um dicionario que relacione modelos de carros e seus consumos");
        Map<String, Double> carros = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.4);
            put("HB20", 16.1);
            put("Kwid", 15.6);

        }};
        System.out.println(carros);

        System.out.println("Substitua o consumo do Gol para 15.2");
        carros.put("Gol", 15.2);
        System.out.println(carros);

        System.out.println("Verifique se Tucson esta no dicionario -> " + carros.containsKey("Tucson"));
        
        System.out.println("Exiba o consumo do Uno -> " + carros.get("Uno"));

        System.out.println("Exiba a terceiro carro adicionado. Não é possível pois Map não tem indice");

        System.out.println("Exibir os modelos -> ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exibir os consumos -> ");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        System.out.println("Exibir o carro mais economico -> ");
        Double consumoEficiente = Collections.max(carros.values());
        Set<Entry<String, Double>> entrySet = carros.entrySet();
        String modeloEficiente = "";
        for (Entry<String,Double> entry : entrySet) {
            if (entry.getValue().equals(consumoEficiente)) modeloEficiente = entry.getKey();
        }
        System.out.println("Modelo mais Eficiente -> " + modeloEficiente + " Consumo -> " + consumoEficiente);


        System.out.println("Exibir o carro menos economico -> ");
        Double consumoMenosEficiente = Collections.min(carros.values());
        Set<Entry<String, Double>> entrySet2 = carros.entrySet();
        String modeloMenosEficiente = "";
        for (Entry<String,Double> entry : entrySet2) {
            if (entry.getValue().equals(consumoMenosEficiente)) modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Modelo menos Eficiente -> " + modeloMenosEficiente + " Consumo -> " + consumoMenosEficiente);

        Double soma = 0d;
        Iterator<Double> iterador = carros.values().iterator();
        while (iterador.hasNext()) {
            soma += iterador.next();
        }

        System.out.println("Exiba a soma dos consumos -> " + soma);

        System.out.println("Exiba a media dos consumos -> " + soma / carros.size());

        System.out.println("Remova os modelos com consumo igual a 15.6");
        Iterator<Double> iterador1 = carros.values().iterator();
        while (iterador1.hasNext()) {
            if (iterador1.next().equals(15.6)) iterador1.remove();
        }
        System.out.println(carros);

        System.out.println("Exiba todos os carros na ordem que foram informados");
        Map<String, Double> carros1 = new LinkedHashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.4);
            put("HB20", 16.1);
            put("Kwid", 15.6);

        }};
        System.out.println(carros1);

        System.out.println("Exiba o dicionario ordenado pelo modelo");
        Map<String, Double> carros3 = new TreeMap<>(carros);
        System.out.println(carros3);

        System.out.println("Apague toda o dicionario");
        carros.clear();
        System.out.println(carros.toString());

        System.out.println("Confira se o dicionario esta vazio -> " + carros.isEmpty());

    }
}
