package dev.gihwan.designpatterns.decorator;

public class ComponentDecoratorImplA extends ComponentDecorator {

    public ComponentDecoratorImplA(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void operate() {
        super.operate();
        System.out.println("Operate component decorator implementation A.");
    }
}
