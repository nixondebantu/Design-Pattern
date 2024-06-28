package Creational_DP.Prototype_DP;

public class Circle {
    public String color;
    private int x, y, radius;

    private Circle() {
    }

    public Circle(String color, int x, int y, int radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    private Circle(Circle c) {
        if (c != null) {
            this.color = c.color;
            this.x = c.x;
            this.y = c.y;
            this.radius = c.radius;
        }
    }

    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle [color=" + color + ", x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }

}
