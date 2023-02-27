import beepers.Beeper;
import engines.Engine;

public abstract class Tractor implements GroundTransport {

    Beeper beeper;
    Engine engine;

    public boolean haveLadle;

    String color = "";

    public Tractor(Beeper beeper, Engine engine) {
        this.beeper = beeper;
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    };
}
