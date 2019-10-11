package pg.instance_of;

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
