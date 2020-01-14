package dev.gihwan.designpatterns.decorator;

public class ComponentImpl implements Component {

    @Override
    public void operate() {
        System.out.println("Operate component implementation.");
    }
}
