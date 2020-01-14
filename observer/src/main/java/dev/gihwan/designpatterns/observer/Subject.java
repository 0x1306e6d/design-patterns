package dev.gihwan.designpatterns.observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyToObservers();

}
