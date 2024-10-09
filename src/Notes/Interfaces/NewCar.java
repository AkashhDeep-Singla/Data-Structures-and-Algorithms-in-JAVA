package Notes.Interfaces;

public class NewCar {
    private Engine engine;
    private Media player;

    public NewCar() {
        engine = new Petrol();
        player = new MusicPlayer();
    }

    public NewCar(Engine engine) {
        this.engine = engine;
        player = new MusicPlayer();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void newEngine(Engine engine) {
        this.engine = engine;
    }
}
