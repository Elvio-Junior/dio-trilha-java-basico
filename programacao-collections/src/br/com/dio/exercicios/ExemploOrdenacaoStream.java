package br.com.dio.exercicios;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.Function;

class Livro {
    private String nome;
    private int paginas;
    
    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + paginas;
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas != other.paginas)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{nome=" + nome + ", paginas=" + paginas + "}";
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        // TODO Auto-generated method stub

        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
        
}

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        // TODO Auto-generated method stub

        return Integer.compare(livro1.getValue().getPaginas(), livro2.getValue().getPaginas());
    }
        
}
public class ExemploOrdenacaoStream {

    public static void main(String[] args) {
        
        System.out.println("Ordem Aleatoria -> HashMap");
        Map<String, Livro> livros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 Licoes Para o Seculo 21", 432));
        }};

        for(Map.Entry<String, Livro> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem Insercao -> LinkedHashMap");
        Map<String, Livro> livros2 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 Licoes Para o Seculo 21", 432));
        }};

        for(Map.Entry<String, Livro> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem Alfabetica Autores -> TreeMap");
        Map<String, Livro> livros3 = new TreeMap<>(livros);

        for(Map.Entry<String, Livro> livro : livros3.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem Alfabetica dos Livros -> TreeSet"); // class comparator
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNome());
        livros4.addAll(livros.entrySet());
        System.out.println(livros4);

        System.out.println("Ordem Numero de Pagina -> TreeSet");
        Set<Map.Entry<String, Livro>> livros5 = new TreeSet<>(new ComparatorPagina());
        livros5.addAll(livros.entrySet());
        System.out.println(livros5);

        System.out.println("Ordem Numero de Pagina -> TreeSet Classe Anonima");
        Set<Map.Entry<String, Livro>> livros6 = new TreeSet<>(new Comparator<Map.Entry<String, Livro>>() {
            @Override
            public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
                // TODO Auto-generated method stub
                return Integer.compare(livro1.getValue().getPaginas(), livro2.getValue().getPaginas());
            }
        });
        livros6.addAll(livros.entrySet());
        System.out.println("Livros 6 " + livros6);

        System.out.println("Ordem Numero de Pagina -> TreeSet ");
        Set<Map.Entry<String, Livro>> livros7 = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<String, Livro>, Integer>() {

                @Override
                public Integer apply(Map.Entry<String, Livro> livro) {
                    // TODO Auto-generated method stub
                    return livro.getValue().getPaginas();
                }
            
        }));
        livros7.addAll(livros.entrySet());
        System.out.println("Livros 7 " + livros7);

        System.out.println("Ordem Numero de Pagina -> TreeSet Lmabda");
        Set<Map.Entry<String, Livro>> livros8 = new TreeSet<>(Comparator.comparing(
            livro -> livro.getValue().getPaginas()));

        livros8.addAll(livros.entrySet());
        System.out.println("Livros 8 " + livros8);
    }
}
