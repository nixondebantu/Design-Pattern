package Lab_Solve_19.Solve_Odd;

import Lab_Solve_19.Solve_Odd.observer.UserView;
import Lab_Solve_19.Solve_Odd.subject.CollaborativeDocument;

public class Main {
    public static void main(String[] args) {
        CollaborativeDocument document = new CollaborativeDocument();
        UserView user1 = new UserView("User 1");
        UserView user2 = new UserView("User 2");

        document.addObserver(user1);
        document.addObserver(user2);

        document.setContent("First version of the document.");
        document.setContent("Updated version of the document.");
    }
}
