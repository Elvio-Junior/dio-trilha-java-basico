package br.com.dio.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".
 */
public class ListClassificacaoSuspeita {
    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<String>();

        String resposta = "";
        String grauSuspeito = "";
        Scanner leitor = new Scanner(System.in);

        System.out.print("Telefonou para a vitima (Sim/Não) -> ");
        resposta = leitor.next();
        perguntas.add(resposta);

        System.out.print("Esteve no local do Crime (Sim/Não) -> ");
        resposta = leitor.next();
        perguntas.add(resposta);

        System.out.print("Mora com a Vitima (Sim/Não) -> ");
        resposta = leitor.next();
        perguntas.add(resposta);

        System.out.print("Devia para a Vitima (Sim/Não) -> ");
        resposta = leitor.next();
        perguntas.add(resposta);

        System.out.print("Trabalhou com a Vitima (Sim/Não) -> ");
        resposta = leitor.next();
        perguntas.add(resposta);

        int count = 0;
        Iterator<String> contador = perguntas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("S")) {
                count ++;
            }
        }
        switch(count) {
            case 2:
                grauSuspeito = "Suspeita";
                break;
            case 3:
            case 4:
                grauSuspeito = "Cumplice";
                break;
            case 5:
                grauSuspeito = "Assassino";
                break;
            default:
                grauSuspeito = "Inocente";
                break;
        }

        System.out.println("Grau do Suspeito -> " + grauSuspeito);
    }
}
