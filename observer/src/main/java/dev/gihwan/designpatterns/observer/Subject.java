package dev.gihwan.designpatterns.observer;

public interface Subject<T> {

    void attach(Observer<T> observer);

    void detach(Observer<T> observer);

    void notifyToObservers(T value);

}
