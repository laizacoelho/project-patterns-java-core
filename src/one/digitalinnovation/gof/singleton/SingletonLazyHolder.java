package one.digitalinnovation.gof.singleton;

//Singleton preguiçoso holder: encapsula a instância do Singleton. Mais aconselhado pois é thread safe
public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return Holder.instance;
    }
}
