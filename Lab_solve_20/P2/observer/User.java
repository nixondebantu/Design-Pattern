package P2.observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void notify(String notification) {
        System.out.println(name + " recived notification: " + notification);
    }

}
