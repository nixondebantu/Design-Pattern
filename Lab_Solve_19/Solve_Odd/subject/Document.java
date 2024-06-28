package Lab_Solve_19.Solve_Odd.subject;

import Lab_Solve_19.Solve_Odd.observer.DocumentObserver;

public interface Document {
    void addObserver(DocumentObserver observer);

    void removeObserver(DocumentObserver observer);

    void notifyObservers();
}
