import java.util.Scanner;

public class UncheckedExceptions {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String a = leitor.next();
        String b = leitor.next();

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado -> " + resultado);        
        } catch (NumberFormatException e) {
            System.out.println("Valor digitado não numerico");
        } catch (ArithmeticException e) {
            System.out.println("Divisao por Zero");
        }





    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
