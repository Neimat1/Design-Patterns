package creational.patterns.factory;

public class Main {
    public static void main(String [] args){
        HamburgerStore hamburgerStore = new HamburgerStore(new SimpleHamburgerFactory());
        Hamburger hamburger = hamburgerStore.orderHamburgger("cheese");
    }
}
