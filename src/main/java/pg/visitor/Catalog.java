package pg.visitor;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        DescriptionGettingVisitor visitor = new DescriptionGettingVisitor();
        animals.forEach(animal ->
                System.out.println(animal.accept(visitor)));
    }

    public static void main(String[] args){

        Catalog catalog = new Catalog();
        Cat cat = new Cat();
        BaldEagle baldEagle = new BaldEagle();
        catalog.addAnimal(cat);
        catalog.addAnimal(baldEagle);

        catalog.showAnimals();
    }
}
