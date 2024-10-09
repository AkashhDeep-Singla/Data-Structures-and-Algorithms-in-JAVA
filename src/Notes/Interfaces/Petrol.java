package Notes.Interfaces;

public class Petrol implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Petrol Engine accelerates");
    }
}
