package structural.patterns.bridge;

public class Circle extends Shape{
    public Circle(ColoredShape coloredShape) {
        super(coloredShape);
    }

    @Override
    public void color( ) {
        System.out.print("Circle : ");
        coloredShape.colorShape();
    }
}
