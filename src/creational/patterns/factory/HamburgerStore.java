package creational.patterns.factory;

public  class HamburgerStore {
    SimpleHamburgerFactory factory;
    public HamburgerStore(SimpleHamburgerFactory factory) {
        this.factory = factory;
    }


    Hamburger orderHamburgger (String type){
        Hamburger burger;
        burger = factory.createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }
    //abstract public  Hamburger createHamburger(String type);
}
