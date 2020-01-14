package dev.gihwan.designpatterns.decorator;

public final class Main {

    public static void main(String[] args) {
        final Component component = new ComponentImpl();
        component.operate();

        final Component componentWithA = new ComponentDecoratorImplA(component);
        componentWithA.operate();
    }
}
