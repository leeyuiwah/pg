package pg.visitor;

public class BaldEagle implements FlyingAnimal {
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

    @Override
    public String accept(AnimalVisitor visitor) {
        return visitor.visit(this);
    };
}
