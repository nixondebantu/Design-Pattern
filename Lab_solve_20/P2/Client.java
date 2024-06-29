package P2;

import P2.notification.Mail;
import P2.notification.SMS;
import P2.observer.User;
import P2.subject.Company;

public class Client {
    public static void main(String[] args) {
        User u1 = new User("User 1");
        User u2 = new User("User 2");
        User u3 = new User("User 3");
        User u4 = new User("User 4");

        Company walton = new Company("Walton", 10);
        walton.setNotification(new Mail());

        walton.addUser(u1);
        walton.addUser(u2);
        walton.addUser(u3);
        walton.addUser(u4);
        walton.updatePrice(12);

        walton.setNotification(new SMS());
        walton.removeUser(u4);
        walton.updatePrice(20);

    }
}
