package dev.gihwan.designpatterns.decorator;

public final class Main {

    public static void main(String[] args) {
        final Component component = new ComponentImpl();
        component.operate();

        final Component componentWithA = new ComponentDecoratorImplA(component);
        componentWithA.operate();

        final Component componentWithB = new ComponentDecoratorImplB(component);
        componentWithB.operate();

        final Component componentWithBWithA = new ComponentDecoratorImplB(componentWithA);
        componentWithBWithA.operate();
    }
}
