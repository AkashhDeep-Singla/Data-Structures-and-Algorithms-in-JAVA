package Notes.Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine maruti = new Car();   // here 'Engine' (type of ref. var.) tell what can be accessed and 'Car' (type of obj.)
                                     // tells which version of it will get accessed.

        maruti.start();
        maruti.acc();
//        maruti.brake(); // can't access brake because even though we are creating a new Car
//                        // but the stuff that can be accessed depends on type of ref. var. and in this case it is 'Engine'
//        int ID = maruti.id;       // SAME CASE HERE so this also won't work
        maruti.stop();

        Media player = new Car();

        player.start();

        NewCar swift = new NewCar();

        swift.start();
        swift.newEngine(new Diesel());
        swift.start();
        swift.startMusic();
    }
}
