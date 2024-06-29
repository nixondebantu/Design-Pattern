package Exercise.P02;

public class Circle implements Shape {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    private Circle(Circle circle) {
        this.radius = circle.radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    @Override
    public Shape getClone() {
        return new Circle(this);
    }

}
