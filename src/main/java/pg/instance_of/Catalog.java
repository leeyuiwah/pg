package pg.instance_of;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        animals.forEach(animal -> {
            StringBuilder sb = new StringBuilder();
            sb.append(animal.getName() + ": ");
            sb.append(animal.makeNoise() + " ");

            // this block exemplifies some processing that is
            //   specific to CanFly animals
            if (animal instanceof CanFly) {
                sb.append(String.format(" (can stay in air for %s km)",
                        ((CanFly) animal).getMaxInAirDistanceKm()));
            }
            System.out.println(sb.toString());
        });
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
