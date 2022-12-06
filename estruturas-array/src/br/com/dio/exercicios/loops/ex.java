package br.com.dio.exercicios.loops;

public class ex {
    public static void main(String[] args) {
        
        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
    }
}
