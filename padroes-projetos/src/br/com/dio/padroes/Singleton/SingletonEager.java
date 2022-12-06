package br.com.dio.padroes.Singleton;
    /*
     * Não vai disponibilizar a instancia para o usuario em primeiro momento
     * Construtor privado
     * Instancia static sendo acessivel por um metodo static publico
     */
public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();
    
    // Privado para controlar a não criação da instancia fora da classe
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
