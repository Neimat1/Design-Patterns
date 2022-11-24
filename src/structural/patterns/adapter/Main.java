package structural.patterns.adapter;

public class Main {
       public static void main(String [] args){
           Bird sparrow = new Sparrow();
           ToyDuck plasticToyDuck = new PlasticToyDuck();
           sparrow.makeSound();

           //our target make plastic toy duck sparrow's sound
           ToyDuck plasticToyDuckWithSoundSparrow = new Adapter(sparrow);
           plasticToyDuckWithSoundSparrow.squeak();
       }

}
