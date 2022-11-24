package structural.patterns.facade;

public class HamburgerMakerFacade {
    private Haumberger cheeseBurger;
    private Haumberger veggieBurger;

    public HamburgerMakerFacade() {
        cheeseBurger = new CheeseBurger();
        veggieBurger = new ViggeBurger();
    }

    public void prepareCheeseBurger(){
        cheeseBurger.prepare();
    }

    public void prepareVeggieBurger(){
        veggieBurger.prepare();
    }

}
