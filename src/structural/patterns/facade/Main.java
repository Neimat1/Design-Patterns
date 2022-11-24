package structural.patterns.facade;

public class Main {
    public  static  void  main(String [] args){
        HamburgerMakerFacade hamburger  = new HamburgerMakerFacade();
        hamburger.prepareCheeseBurger();
        hamburger.prepareVeggieBurger();
    }
}
