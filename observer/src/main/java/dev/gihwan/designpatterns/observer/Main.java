package dev.gihwan.designpatterns.observer;

public final class Main {

    private static final int NUM_OBSERVERS = 5;

    public static void main(String[] args) {
        final ConcreteSubject subject = new ConcreteSubject();

        for (int i = 0; i < NUM_OBSERVERS; i++) {
            final ConcreteObserver observer = new ConcreteObserver("Observer-" + i);
            subject.attach(observer);
        }

        subject.readForever();
    }
}
