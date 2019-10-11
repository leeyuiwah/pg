package pg.instance_of;

public class BaldEagle implements Animal, CanFly {
    @Override
    public float getMaxInAirDistanceKm() {
        return 50.0f;
    }

    @Override
    public String getName() {
        return "BaldEagle";
    }

    @Override
    public String makeNoise() {
        return "whistle";
    }
}
