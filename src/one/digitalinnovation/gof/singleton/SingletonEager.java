package one.digitalinnovation.gof.singleton;

//Já atribui a instância quando essa classe é chamada por alguém
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
