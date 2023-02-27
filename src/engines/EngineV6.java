package engines;

public class EngineV6 implements Engine{

    @Override
    public Integer getSpeed() {
        return 210;
    }

    @Override
    public String start() {
        return "Раз.... Два... Три... Четырееее... О, завелась!";
    }

    @Override
    public String stop() {
        return "Апчхи!";
    }
}
