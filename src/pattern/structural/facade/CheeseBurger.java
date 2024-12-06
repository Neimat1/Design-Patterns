package pattern.structural.facade;

public class CheeseBurger implements Haumberger {
    @Override
    public void prepare() {
        System.out.println("Prepare Cheese burger");
    }
}
