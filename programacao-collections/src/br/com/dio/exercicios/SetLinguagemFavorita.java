package br.com.dio.exercicios;
/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Linguagem {

    public String nome;
    public Integer anoDeCriacao;
    public String ide;
    
    public Linguagem(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }
    public String getNome() {
        return nome;
    }
    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public String getIde() {
        return ide;
    }
    @Override
    public String toString() {
        return "{nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "}";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((anoDeCriacao == null) ? 0 : anoDeCriacao.hashCode());
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
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
        Linguagem other = (Linguagem) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeCriacao == null) {
            if (other.anoDeCriacao != null)
                return false;
        } else if (!anoDeCriacao.equals(other.anoDeCriacao))
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;
    }
}
public class SetLinguagemFavorita {
    public static void main(String[] args) {
        
        Set<Linguagem> linguagens = new HashSet<>() {{
            add(new Linguagem("Java", 2000, "InteliJ"));
            add(new Linguagem("Python", 1990, "VS Code"));
        }};

        System.out.println("Ordem Aleatoria");

        for (Linguagem linguagem : linguagens) {
            System.out.println("nome=" + linguagem.getNome() + ", anoDeCriacao=" + linguagem.getAnoDeCriacao() + ", ide=" + linguagem.getIde());
        }


        System.out.println("a) Ordem de inserção;");
        Set<Linguagem> linguagens2 = new LinkedHashSet<>() {{
            add(new Linguagem("Java", 2000, "InteliJ"));
            add(new Linguagem("Python", 1990, "VS Code"));
        }};
        for (Linguagem linguagem : linguagens2) {
            System.out.println("nome=" + linguagem.getNome() + ", anoDeCriacao=" + linguagem.getAnoDeCriacao() + ", ide=" + linguagem.getIde());
         }

        System.out.println("b) Ordem natural(nome);"); // implementar o Comparable
        Set<Linguagem> linguagens3 = new TreeSet<>(linguagens2);
        System.out.println(linguagens3);

        // System.out.println("Ordem Nome Genero TempoEpisodio");
        // Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        // series4.addAll(series);
        // System.out.println(series4);
    }
}
