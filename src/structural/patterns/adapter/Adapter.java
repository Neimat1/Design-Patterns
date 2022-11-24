package structural.patterns.adapter;

public class Adapter implements ToyDuck{
    ///goal is to make plastic toy duck sound like sparrow
    ///so client will use plastic toy duck
    Bird bird;

    public Adapter(Bird bird) {
        this.bird = bird;
    }


    @Override
    public void squeak() {
        bird.makeSound();
    }
}
