public class MultiploDeCinco implements Multiplo{
    @Override
    public String verificarMultiplo(boolean multiploDeTres, boolean multiploDeCinco, int numero) {
        String multiplo = Integer.toString(numero);

        if (!multiploDeTres && multiploDeCinco) {
            multiplo = "Buzz";
        }
        return multiplo;
      }
}
