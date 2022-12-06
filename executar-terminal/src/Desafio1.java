import java.util.*;

public class Desafio1 {

    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        int A, B;
        Scanner leitor = new Scanner(System.in);
        
        A = leitor.nextInt();
        B = leitor.nextInt();

        if (A == B) {
          System.out.print("Sao iguais!");
        } else {
          System.out.print("Nao sao iguais!");
        }
        
    }
}
