package structural.patterns.bridge;

public class BlueShape implements ColoredShape{
    @Override
    public void colorShape() {
        System.out.println("Shape in blue");
    }
}
