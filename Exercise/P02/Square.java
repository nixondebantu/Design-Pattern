package Exercise.P02;

public class Square implements Shape {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }

    private Square(Square square) {
        this.side = square.side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side " + side);
    }

    @Override
    public Shape getClone() {
        return new Square(this);
    }
}
