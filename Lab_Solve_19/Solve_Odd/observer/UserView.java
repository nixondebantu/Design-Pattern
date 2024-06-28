package Lab_Solve_19.Solve_Odd.observer;

public class UserView implements DocumentObserver {
    private String content;
    private String name;

    public UserView(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Updated Document Content of " + name + ": " + content);
    }

    @Override
    public void update(String content) {
        this.content = content;
        display();
    }

}
