package br.com.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FatorialDesajeitado2 {
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
            add("-");
            add("+");
        }};

        
        montarExpressaoNumerica(N, expressaoNumerica, precedenciaOperadores);

        calcularExpressaoMatematica("*", expressaoNumerica);
        
        calcularExpressaoMatematica("/", expressaoNumerica);

        calcularExpressaoMatematica("+", expressaoNumerica);

        System.out.println(expressaoNumerica);
    
    }

    private static void calcularExpressaoMatematica(String operador, List<String> expressaoNumerica) {
        int resultado = 0;
        // Loop responsável por percorrer os valores do Array expressaoNumerica
        for (int i = 0; i < expressaoNumerica.size(); i++) {
            String valorExpressaoNumerica = expressaoNumerica.get(i);
            if (operador == valorExpressaoNumerica || valorExpressaoNumerica == "-" && operador == "+") {
                resultado = realizarOperacaoAritmetica(i, valorExpressaoNumerica, expressaoNumerica);
                recomporExpressaoNumerica(i, resultado, expressaoNumerica);
                if (valorExpressaoNumerica == "-" && operador == "+") i = 0;
            }
        }
    }

    /*
     * Função responsável por realizar montar a expressão matematica a ser realizada
     */
    private static void montarExpressaoNumerica(int N, List<String> expressaoNumerica, List<String> precedenciaOperadores) {
        int posicaoPrecedenciaOperadores = 0;
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