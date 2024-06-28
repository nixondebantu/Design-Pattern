package Lab_Solve_19.Solve_Odd.subject;

import java.util.ArrayList;
import java.util.List;

import Lab_Solve_19.Solve_Odd.observer.DocumentObserver;

public class CollaborativeDocument implements Document {
    private List<DocumentObserver> observers;
    private String content;

    public CollaborativeDocument() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(DocumentObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DocumentObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (DocumentObserver documentObserver : observers) {
            documentObserver.update(content);
        }
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }

    public String getContent() {
        return content;
    }

}
