public class Argumentos {
    public static void main(String[] args) {
        String nome = args[0];
        String sobreNome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Nome: " + nome + ". Sobrenome: " +  sobreNome + ". Idade: " + idade + ". Altura: " + altura);

    }
}

/*
 * java <Classe> Nome Sobrenome Idade Altura
 * IDE -> Executar -> Adicionar Configuração
 */
