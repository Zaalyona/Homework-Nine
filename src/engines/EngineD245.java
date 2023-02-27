package engines;

public class EngineD245 implements Engine {
    @Override
    public Integer getSpeed() {
        return 40;
    }

    @Override
    public String start() {
        return "Ещё разок...";
    }

    @Override
    public String stop() {
        return "Наконец отдыхать!";
    }
}
