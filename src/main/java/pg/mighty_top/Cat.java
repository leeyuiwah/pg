package pg.mighty_top;

public class Cat implements Animal {
    @Override
    public String getName() {
        return "Cat";
    }

    @Override
    public String makeNoise() {
        return "meow";
    }
}