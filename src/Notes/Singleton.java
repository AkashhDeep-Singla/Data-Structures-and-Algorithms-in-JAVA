package Notes;

public class Singleton {
    private Singleton() {

    }
    private static Singleton instance;

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all three ref. variables point to one same object
    }
}
