package pg.visitor;

public interface Animal {
    String getName();
    String makeNoise();
    default String accept(AnimalVisitor visitor) {
        return visitor.visit(this);
    };
}
