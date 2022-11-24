package structural.patterns.facade;

public class ViggeBurger implements Haumberger {
    @Override
    public void prepare() {
        System.out.println("Prepare Vigge hamburger");
    }
}
