import beepers.Beeper;
import engines.Engine;

public class Lambo extends Car {

    public Lambo(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    String getCost() {
        return "999999999999";
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
        return "Поехали!";
    }

    @Override
    public String stopMoving() {
        return "Уже стою!";
    }

    @Override
    public String reverseMoving() {
        return "Задняя скорость включена";
    }

    @Override
    public String getSpeed() {
        return Integer.toString(engine.getSpeed()) + "km/h";
    }
}
