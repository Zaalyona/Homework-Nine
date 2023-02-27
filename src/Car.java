import beepers.Beeper;
import engines.Engine;

public abstract class Car implements GroundTransport {

    Beeper beeper;
    Engine engine;

    public Car(Beeper beeper, Engine engine) {
        this.beeper = beeper;
        this.engine = engine;
    }

    public String openDoor() {
        return "Дверь открылась";
    }

    public String closeDoor() {
        return "Дверь закрылась";
    }

    public String openWindows() {
        return "Окно открылось ";
    }

    public String closeWindows() {
        return "Окно закрылось";
    }

}
