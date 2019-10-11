package pg.visitor;

public class DescriptionGettingVisitor implements AnimalVisitor {
    @Override
    public String visit(Animal animal) {
        StringBuilder sb = new StringBuilder();
        sb.append(animal.getName() + ": ");
        sb.append(animal.makeNoise() + " ");
        return sb.toString();
    }

    @Override
    public String visit(FlyingAnimal flyingAnimal) {
        StringBuilder sb = new StringBuilder();
        sb.append(flyingAnimal.getName() + ": ");
        sb.append(flyingAnimal.makeNoise() + " ");
        sb.append(String.format(" (can stay in air for %s km)",
                flyingAnimal.getMaxInAirDistanceKm()));
        return sb.toString();
    }
}
