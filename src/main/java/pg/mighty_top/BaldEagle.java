package pg.mighty_top;

import java.util.Optional;

public class BaldEagle implements Animal{
    @Override
    public Optional<Float> getMaxInAirDistanceKm() {
        return Optional.of(50.0f);
    }

    @Override
    public boolean canFly() {
        return true;
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
