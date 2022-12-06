import java.util.*;

public class Desafio2 {
    public static void main(String[] args) {
        
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        int resultado = 0, multiplo = 0;

        for (int i=1;  multiplo < N; i++) {
            multiplo = A * i;
            resultado = resultado + multiplo;
        }
        System.out.println(resultado);
    }
}
