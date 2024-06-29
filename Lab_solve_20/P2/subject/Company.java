package P2.subject;

import java.util.ArrayList;
import java.util.List;

import P2.notification.Notification;
import P2.observer.Observer;

public class Company implements Subject {
    private String name;
    private int price;
    private List<Observer> observers;
    private Notification notification;

    public Company(String name, int price) {
        this.name = name;
        this.price = price;
        observers = new ArrayList<>();
    }

    public void setNotification(Notification notification){
        this.notification=notification;
    }

    public void addUser(Observer user) {
        observers.add(user);
    }

    public void removeUser(Observer user) {
        observers.remove(user);
    }

    @Override
    public void updatePrice(int price) {
        this.price = price;
        notifyUsers();
    }

    @Override
    public void notifyUsers() {
        String notificationTxt = notification.sendNotification("Updated price of "+name+" : $"+price);
        for (Observer observer : observers) {
            observer.notify(notificationTxt);
        }
    }

}
