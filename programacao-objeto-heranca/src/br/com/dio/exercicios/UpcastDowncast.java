package br.com.dio.exercicios;

public class UpcastDowncast {
    public static void main(String[] args) {
        /* Upcast */

        Funcionario funcionario = new Funcionario();
        
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();

        /* Downcast */
        Vendedor vendedor2 = (Vendedor) new Funcionario();

    }
}
