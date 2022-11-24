package structural.patterns.bridge;

public abstract class Shape {
    protected ColoredShape coloredShape;

    public Shape(ColoredShape coloredShape) {
        this.coloredShape = coloredShape;
    }

    public abstract void color();
}
