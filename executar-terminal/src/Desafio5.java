
import java.util.*;

public class Desafio5 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int elemento = leitor.nextInt();

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        
        encontrarPosicaoElemento(elementos, elemento);

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }

    static void encontrarPosicaoElemento(int[] elementos, int numero) {
        int posicao = -1;

        for (int i=0;  i < elementos.length; i++) {
            if (elementos[i] == numero) {
                posicao = i;
            }
        }
        if (posicao >= 0) {
            System.out.println("Achei "+ numero + " na posicao " + posicao);
        } else {
            System.out.println("Numero "+ numero + " nao encontrado!");
        }

    }
}
