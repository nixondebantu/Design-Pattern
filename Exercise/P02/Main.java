package Exercise.P02;

public class Main {
    public static void main(String[] args) {
        Shape originalCircle = new Circle(5);
        Shape originalSquare = new Square(10);
        Shape clonedCircle = originalCircle.getClone();
        Shape clonedSquare = originalSquare.getClone();

        originalCircle.draw();
        clonedCircle.draw();
        originalSquare.draw();
        clonedSquare.draw();

    }
}
