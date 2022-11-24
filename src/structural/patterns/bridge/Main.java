package structural.patterns.bridge;

public class Main {
    public static  void  main(String [] args){
        Shape redCircle = new Circle(new RedShape());
        Shape blueCircle = new Circle(new BlueShape());
        redCircle.color();
        blueCircle.color();


        Shape redSquare = new Square(new RedShape());
        Shape blueSquare = new Square(new BlueShape());
        redSquare.color();
        blueSquare.color();
    }
}
