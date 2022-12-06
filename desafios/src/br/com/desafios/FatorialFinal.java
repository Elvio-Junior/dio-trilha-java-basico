package br.com.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FatorialFinal {
    
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
        }};

        montarExpressaoNumerica(N, expressaoNumerica, precedenciaOperadores);

        calcularExpressaoMatematica(precedenciaOperadoresExecucao, expressaoNumerica);

        System.out.println(expressaoNumerica.get(0));
    }

    private static void calcularExpressaoMatematica( List<String> precedenciaOperadoresExecucao, List<String> expressaoNumerica) {
        

        for (String operador : precedenciaOperadoresExecucao) {
            // System.out.println("Expressao a ser calculada " + expressaoNumerica);
            // System.out.println("Realizar operacao " + operador);
            int i = 0, resultado = 0, operando1 = 0, operando2 = 0;
            while (i < expressaoNumerica.size()){
                String valorExpressaoNumerica = expressaoNumerica.get(i);
                if (operador == valorExpressaoNumerica || operador == "+" && valorExpressaoNumerica == "-") {
                    // System.out.println(expressaoNumerica.get(i-1) + "" + valorExpressaoNumerica + "" + expressaoNumerica.get(i+1));
                    operando1 = Integer.parseInt(expressaoNumerica.get(i-1));
                    operando2 = Integer.parseInt(expressaoNumerica.get(i+1));
                    resultado = realizarOperacaoAritmetica(valorExpressaoNumerica, operando1, operando2);
                    recomporExpressaoNumerica(i, resultado, expressaoNumerica);
                    if (operador == "+" || valorExpressaoNumerica == "-") i = 0;
                }
                i+= 1;
            }
            
        }

    }
    /*
     * Função responsável por montar a expressão matematica a ser calculada
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
    private static int realizarOperacaoAritmetica(String operador, int operando1, int operando2) {
        int resultado =0;
        switch (operador) {
            case "*": 
                resultado = operando1 * operando2;
                break;
            case "/": 
                resultado = operando1 / operando2;
                break;
            case "-": 
                resultado = operando1 - operando2;
                break;
            case "+": 
                resultado = operando1 + operando2;
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
