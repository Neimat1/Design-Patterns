package structural.patterns.bridge;

public class Square extends Shape{
    public Square(ColoredShape coloredShape) {
        super(coloredShape);
    }

    @Override
    public void color() {
        System.out.print("Square : ");
        coloredShape.colorShape();

    }
}
