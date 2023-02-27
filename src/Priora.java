import beepers.Beeper;
import engines.Engine;

public class Priora extends Car {

    public Priora(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    String downShifting() {
        return "Занижена";
    }

    @Override
    public String start() {
        return engine.start();
    }

    @Override
    public String stop() {
        return engine.stop();
    }

    @Override
    public String startMoving() {
        return "Ты третью скорость включи, я с первой не могу тронуться...";
    }

    @Override
    public String stopMoving() {
        return "Да торможу я, торможу.... ";
    }

    @Override
    public String reverseMoving() {
        return "А я и задним ходом умею ехать? 0_о";
    }

    @Override
    public String getSpeed() {
        return Integer.toString(engine.getSpeed()) + " km/h";
    }
}
