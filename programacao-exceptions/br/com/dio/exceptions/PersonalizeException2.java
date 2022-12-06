public class PersonalizeException2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] %2 != 0)
                    throw new ErroDivisaoException("Numerador não par", numerador[i], denominador[i]);
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);            
            
            } catch (ErroDivisaoException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            
            } 

        }

        System.out.println("Fim!");
    }
}