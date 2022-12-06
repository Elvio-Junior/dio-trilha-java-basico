// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio4 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        final int TRES = 3;
        final int CINCO = 5;
        
        boolean eMultiploDeTres = verificarNumeroMultiplo(num, TRES);
        
        boolean eMultiploDeCinco = verificarNumeroMultiplo(num, CINCO);

        String verificaMultiplo = verificarMultiplo(eMultiploDeTres, eMultiploDeCinco, num);

        System.out.println(verificaMultiplo);

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        
    }
    static boolean verificarNumeroMultiplo(int numero, int multiplo) {
        boolean eMultiplo = (numero % multiplo == 0) ? true : false;

        return eMultiplo;
      }

      static String verificarMultiplo(boolean multiploDeTres, boolean multiploDeCinco, int numero) {
        String multiplo = Integer.toString(numero);
        
        if (multiploDeTres && multiploDeCinco) {
            multiplo = "FizzBuzz";
        }
        if (multiploDeTres && !multiploDeCinco) {
            multiplo = "Fizz";
        }
        if (!multiploDeTres && multiploDeCinco) {
            multiplo = "Buzz";
        }
        return multiplo;
      }
}
