package br.com.dio.exercicios;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEmpisodio;

    public Serie(String nome, String genero, Integer tempoEmpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEmpisodio = tempoEmpisodio;
    }
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEmpisodio() {
        return tempoEmpisodio;
    }
    @Override
    public String toString() {
        return "{nome=" + nome + ", genero=" + genero + ", tempoEmpisodio=" + tempoEmpisodio + "}";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEmpisodio == null) ? 0 : tempoEmpisodio.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEmpisodio == null) {
            if (other.tempoEmpisodio != null)
                return false;
        } else if (!tempoEmpisodio.equals(other.tempoEmpisodio))
            return false;
        return true;
    }
    @Override
    public int compareTo(Serie serie) {
        // TODO Auto-generated method stub
        int tempoEpisodio = Integer.compare(this.getTempoEmpisodio(), serie.getTempoEmpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        int genero = this.getGenero().compareTo(serie.getGenero());
        return genero;

    }

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        // TODO Auto-generated method stub
        int nome = serie1.getNome().compareTo(serie2.getNome());
        
        
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) return nome;

        int tempoEpisodio = Integer.compare(serie1.getTempoEmpisodio(), serie2.getTempoEmpisodio());
        return tempoEpisodio;
    }

}

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        Set<Serie> series = new HashSet<>() {{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That 70s show", "Comedia", 25));
        }};

        System.out.println("Ordem Aleatoria");
        for (Serie serie : series) {
            System.out.println("Nome=" + serie.getNome() + ", genero=" + serie.getGenero() + ", tempoEmpisodio=" + serie.getTempoEmpisodio());
        }

        System.out.println("Ordem de Insercao");
        Set<Serie> series2 = new LinkedHashSet<>() {{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That 70s show", "Comedia", 25));
        }};
        for (Serie serie : series2) {
            System.out.println("Nome=" + serie.getNome() + ", genero=" + serie.getGenero() + ", tempoEmpisodio=" + serie.getTempoEmpisodio());
        }

        System.out.println("Ordem Natural - Tempo Episodio");
        Set<Serie> series3 = new TreeSet<>(series2);
        System.out.println(series3);

        System.out.println("Ordem Nome Genero TempoEpisodio");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series4.addAll(series);
        System.out.println(series4);

    }
}

