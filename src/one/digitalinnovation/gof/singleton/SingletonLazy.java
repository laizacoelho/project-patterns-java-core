package one.digitalinnovation.gof.singleton;

//Singleton preguiçoso: em um primeiro momento não disponibiliza um instância, só quando a classe for chamada
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
