package Notes.Interfaces;

public interface Engine {
    static final int PRICE = 79000;      // redundant -> by default java knows that it is static or final or abstract

    abstract public void start();
    void stop();
    void acc();
}
