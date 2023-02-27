import beepers.Beeper;
import engines.Engine;

public class Belarus extends Tractor {

    public Belarus(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    @Override
    public String start() {
        System.out.println(engine.start());
        System.out.println(engine.start());
        return "Ура, завёлся!";
    }

    @Override
    public String stop() {
        return engine.stop();
    }

    @Override
    public String startMoving() {
        return "Ещё газку подкинь!";
    }

    @Override
    public String stopMoving() {
        return "Не, я так быстро остановиться не могу! Берегиии забооор!";
    }

    @Override
    public String reverseMoving() {
        return "А зачем тебе назад?";
    }

    @Override
    public String getSpeed() {
        return Integer.toString(engine.getSpeed()) + " km/h";
    }

    @Override
    public String openDoor() {
        return "У меня есть дверь? 0_0";
    }

    @Override
    public String closeDoor() {
        return "Себе так постучи!";
    }
}
