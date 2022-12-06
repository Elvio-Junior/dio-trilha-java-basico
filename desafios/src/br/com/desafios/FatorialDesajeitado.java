package br.com.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int N = numero.nextInt();
        List<String> expressaoNumerica = new ArrayList<String>();
        List<String> precedenciaOperadores = new ArrayList<String>(){{
            add("*");
            add("/");
            add("+");
            add("-");
        }};
        List<String> precedenciaOperadoresExecucao = new ArrayList<String>(){{
            add("*");
            add("/");
            add("+");
            add("-");
        }};

        int posicaoPrecedenciaOperadores = 0;
        int resultado = 0;
    
        // Loop responsável por instanciar no Array expressaoNumerica com a expressao aritmetica com
        // os numeros e operações matematicas a serem calculados. Exemplo: [4, *, 3, /, 2, +, 1]
        for (int i = N; i > 0; i--) {
            expressaoNumerica.add(Integer.toString(i));
            // Condição para não adicionar o operador matematico após o ultimo numero da sequencia
            // de valores
            if (i != 1) expressaoNumerica.add(precedenciaOperadores.get(posicaoPrecedenciaOperadores));
            posicaoPrecedenciaOperadores +=1;
            // Reposicionar a posição para o inicio
            if (posicaoPrecedenciaOperadores == 4) posicaoPrecedenciaOperadores = 0;
        }

        // Loop responsável por percorrer as operações matematicas a serem executadas
        for (String operador : precedenciaOperadoresExecucao) {
            // Loop responsável por percorrer os valores do Array expressaoNumerica
            for (int i = 0; i < expressaoNumerica.size(); i++) {
                String valorExpressaoNumerica = expressaoNumerica.get(i);
                if (operador == valorExpressaoNumerica) {
                    resultado = realizarOperacaoAritmetica(i, valorExpressaoNumerica, expressaoNumerica);
                    recomporExpressaoNumerica(i, resultado, expressaoNumerica);
                }
            }
            // Este if tem por objetivo realizar a ultima operação aritmetica do Array expressaoNumerica
            // Exemplo: [12, +, 1]
            if (expressaoNumerica.size() == 3) {
                resultado = realizarOperacaoAritmetica(1, expressaoNumerica.get(1), expressaoNumerica);
                expressaoNumerica.clear();    
            }
        }

        System.out.println(resultado);
    
    }
    /*
     * Função responsável por realizar as operações matematicas conforme parametros recebidos e retornar
     * o valor calculado
     *  - posicao: posição do operador matematico no array
     *  - operador: operação matematica a ser realizada
     *  - expressaoNumerica: array com os numeros e operações matematicas
     */
    private static int realizarOperacaoAritmetica(int posicao, String operador, List<String> expressaoNumerica) {
        int operador1 = 0,  operador2 = 0, resultado = 0;
        switch (operador) {
            case "*": 
                operador1 = Integer.parseInt(expressaoNumerica.get(posicao-1));
                operador2 = Integer.parseInt(expressaoNumerica.get(posicao+1));
                resultado = operador1 * operador2;
                break;
            case "/": 
                operador1 = Integer.parseInt(expressaoNumerica.get(posicao-1));
                operador2 = Integer.parseInt(expressaoNumerica.get(posicao+1));
                resultado = operador1 / operador2;
                break;
            case "-": 
                operador1 = Integer.parseInt(expressaoNumerica.get(posicao-1));
                operador2 = Integer.parseInt(expressaoNumerica.get(posicao+1));
                resultado = operador1 - operador2;
                break;
            case "+": 
                operador1 = Integer.parseInt(expressaoNumerica.get(posicao-1));
                operador2 = Integer.parseInt(expressaoNumerica.get(posicao+1));
                resultado = operador1 + operador2;
                break;
        }
        return resultado; 
    }    
    /* Função responsável por recompor o array após efetuar a operação matematica. Irá receber como parametro:
     *  - posicao: posição do operador matematico no array
     *  - resultado: resultado da operação matematica realizada
     *  - expressaoNumerica: array com os numeros e operações matematicas
     * Exemplo: [4, *, 3, /, 2, +, 1]
     * Realizar a multiplicação 4 * 3 = 12. 
     * -> expressaoNumerica.set(posicao, Integer.toString(resultado)): Irá inserir o resultado da operação matematica
     *    na posição do operador matematico. Exemplo: [4, 12, 3, /, 2, +, 1]
     * -> expressaoNumerica.remove(posicao-1): Irá remover o numero anterior a posição do operador matematico.
     *    Exemplo: [12, 3, /, 2, +, 1]
     * -> expressaoNumerica.remove(posicao-1): Irá remover o numero anterior a posição do operador matematico.
     *    Exemplo: [12, /, 2, +, 1]
     */
    private static void recomporExpressaoNumerica(int posicao, int resultado, List<String> expressaoNumerica){
        expressaoNumerica.set(posicao, Integer.toString(resultado));
        expressaoNumerica.remove(posicao-1);
        expressaoNumerica.remove(posicao);       
    }
}