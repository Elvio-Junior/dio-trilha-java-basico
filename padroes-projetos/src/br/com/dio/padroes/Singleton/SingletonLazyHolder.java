package br.com.dio.padroes.Singleton;
    /*
     * Não vai disponibilizar a instancia para o usuario em primeiro momento
     * Construtor privado
     * Instancia static sendo acessivel por um metodo static publico
     */
public class SingletonLazyHolder {
    
    // Encapsular a instancia. Recomendado por ser thread safe.
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
