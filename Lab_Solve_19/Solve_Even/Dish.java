package Lab_Solve_19.Solve_Even;

public class Dish implements MenuComponent {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Dish: " + name);
    }

}
