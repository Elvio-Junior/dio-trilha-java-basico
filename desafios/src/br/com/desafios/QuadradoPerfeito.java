package br.com.desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int x, qtdeQuadradoPerfeito, quadradoPerfeito;
        List<Integer> quadradosPerfeitos = new ArrayList<Integer>();
        List<Integer> iterarQuadradosPerfeitos = new ArrayList<Integer>();
        List<Integer> resultadoQuadradosPerfeitos = new ArrayList<Integer>();

        for (int i=1; i<=n;i++){
            if (i*i<=n){
                quadradosPerfeitos.add(i*i);
            }
        }
        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.

        for (Integer quadrados : quadradosPerfeitos) {
            //System.out.println("For quadrados -> " + quadrados);
            iterarQuadradosPerfeitos = quadradosPerfeitos;
            x = quadrados;
            qtdeQuadradoPerfeito = 1;
            quadradoPerfeito = 0;
            for (Integer iterar : iterarQuadradosPerfeitos) {
                //System.out.println("For iterar -> " + iterar);
                while (quadradoPerfeito <= n) {
                    quadradoPerfeito = x + (iterar * qtdeQuadradoPerfeito);
                    qtdeQuadradoPerfeito += 1;
                    if (quadradoPerfeito == n) resultadoQuadradosPerfeitos.add(qtdeQuadradoPerfeito);
                }
                qtdeQuadradoPerfeito = 1;
                quadradoPerfeito = 0;
            }
        }
        System.out.println(Collections.min(resultadoQuadradosPerfeitos));
    }
}
