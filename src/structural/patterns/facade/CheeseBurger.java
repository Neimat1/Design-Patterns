package structural.patterns.facade;

public class CheeseBurger implements Haumberger {
    @Override
    public void prepare() {
        System.out.println("Prepare Cheese burger");
    }
}
