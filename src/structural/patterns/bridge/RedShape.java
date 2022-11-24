package structural.patterns.bridge;

public class RedShape implements ColoredShape{
    @Override
    public void colorShape() {
        System.out.println("Shape in red");
    }
}
