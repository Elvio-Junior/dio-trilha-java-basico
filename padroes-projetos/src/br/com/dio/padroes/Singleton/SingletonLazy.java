package br.com.dio.padroes.Singleton;
    /*
     * Não vai disponibilizar a instancia para o usuario em primeiro momento
     * Construtor privado
     * Instancia static sendo acessivel por um metodo static publico
     */
public class SingletonLazy {
    
    private static SingletonLazy instancia;
    
    // Privado para controlar a não criação da instancia fora da classe
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}