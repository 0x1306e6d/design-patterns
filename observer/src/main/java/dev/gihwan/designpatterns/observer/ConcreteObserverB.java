package dev.gihwan.designpatterns.observer;

public class ConcreteObserverB implements Observer<Integer> {

    private int sum;
    private final String name;

    public ConcreteObserverB(String name) {
        this.name = name;
    }

    @Override
    public void update(Integer value) {
        sum += value;
        System.out.println("[" + name + "] updated value = " + value + ", sum = " + sum);
    }
}
