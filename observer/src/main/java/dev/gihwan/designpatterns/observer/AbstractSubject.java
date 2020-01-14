package dev.gihwan.designpatterns.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractSubject implements Subject {

    private final List<Observer> observers;

    protected AbstractSubject() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("An observer " + observer + " is attached.");
    }

    @Override
    public void detach(Observer observer) {
        final boolean removed = observers.remove(observer);
        if (removed) {
            System.out.println("An observer " + observer + " is detached.");
        }
    }

    @Override
    public void notifyToObservers() {
        observers.forEach(Observer::update);
    }
}
