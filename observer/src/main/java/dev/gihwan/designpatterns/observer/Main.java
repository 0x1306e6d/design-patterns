package dev.gihwan.designpatterns.observer;

public final class Main {

    private static final int NUM_OBSERVERS = 5;

    public static void main(String[] args) {
        final ConcreteSubject subject = new ConcreteSubject();

        for (int i = 0; i < NUM_OBSERVERS; i++) {
            final ConcreteObserverA observerA = new ConcreteObserverA("ObserverA-" + i);
            subject.attach(observerA);
        }

        for (int i = 0; i < NUM_OBSERVERS; i++) {
            final ConcreteObserverB observerB = new ConcreteObserverB("ObserverB-" + i);
            subject.attach(observerB);
        }

        subject.readForever();
    }
}
