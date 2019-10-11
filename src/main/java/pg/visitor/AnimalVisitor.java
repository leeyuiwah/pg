package pg.visitor;

public interface AnimalVisitor {
    String visit(Animal animal);
    String visit(FlyingAnimal flyingAnimal);
}
