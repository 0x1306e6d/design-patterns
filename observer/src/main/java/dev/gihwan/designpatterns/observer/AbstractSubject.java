package dev.gihwan.designpatterns.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractSubject<T> implements Subject<T> {

    private final List<Observer<T>> observers;

    protected AbstractSubject() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void attach(Observer<T> observer) {
        observers.add(observer);
        System.out.println("An observer " + observer + " is attached.");
    }

    @Override
    public void detach(Observer<T> observer) {
        final boolean removed = observers.remove(observer);
        if (removed) {
            System.out.println("An observer " + observer + " is detached.");
        }
    }

    @Override
    public void notifyToObservers(T value) {
        observers.forEach(observer -> observer.update(value));
    }
}
