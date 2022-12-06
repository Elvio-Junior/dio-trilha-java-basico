package br.com.desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClassificandoMAtrizes {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);        
        int N = input.nextInt();
        int [] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }
        int indice = 0, posicaoDoPar = 0, par = 0, impar =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                posicaoDoPar = i;
                par = nums[posicaoDoPar];
                impar = nums[indice];
                nums[indice] = par;
                nums[posicaoDoPar] = impar;
                indice += 1;
            }
        }

        for (int i : nums) {
            System.out.println(i);
            
        }
    }
}
