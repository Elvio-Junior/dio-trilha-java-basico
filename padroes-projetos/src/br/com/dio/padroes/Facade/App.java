package br.com.dio.padroes.Facade;

public class App {
    
    public static void main(String[] args) {
        
        Facade facade = new Facade();
        facade.migrarCliente("Junior", "14400000");
    }
}
