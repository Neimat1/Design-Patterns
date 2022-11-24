package creational.patterns.factory;

public class SimpleHamburgerFactory {
   public  Hamburger createHamburger (String type){
       Hamburger hamburger = null;

       if(type.equals("cheese")){
           hamburger = new CheeseBurger();
       }
       else if(type.equals("veggie")){
           hamburger = new VeggieBurger();
       }
       return hamburger;
   }
}
