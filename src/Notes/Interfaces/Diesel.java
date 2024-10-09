package Notes.Interfaces;

public class Diesel implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Diesel Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Diesel Engine accelerates");
    }
}
