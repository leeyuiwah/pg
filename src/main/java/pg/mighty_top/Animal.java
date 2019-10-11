package pg.mighty_top;

import java.util.Optional;

import static java.util.Optional.empty;

public interface Animal {
    String getName();
    String makeNoise();
    default boolean canFly() { return false; };
    default Optional<Float> getMaxInAirDistanceKm() { return Optional.empty(); };
}