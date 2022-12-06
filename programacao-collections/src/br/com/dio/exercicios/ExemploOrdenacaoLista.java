package br.com.dio.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;
    
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{nome=" + nome + ", idade=" + idade + ", cor=" + cor + "}";
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
        // 0 -> tem nomes iguais
        // 1 -> o nome é maior
        // -1 -> o nome é menor 
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
    
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
    
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
    
}

public class ExemploOrdenacaoLista {
    public static void main(String[] args) {
        
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
            
        }};

        System.out.println("Ordem de Insercao");
        System.out.println(gatos);

        System.out.println("Ordem Aleatoria");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Ordem Natural");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Ordem Idade");
        //Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Ordem Cor");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Ordem Nome Cor Idade");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);

    }
}
