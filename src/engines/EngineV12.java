package engines;

import engines.Engine;

public class EngineV12 implements Engine {

    @Override
    public Integer getSpeed() {
        return 300;
    }

    @Override
    public String start() {
        return "Rrrrrrrrrrrr";
    }

    @Override
    public String stop() {
        return "Остановлено";
    }
}
