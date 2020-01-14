package dev.gihwan.designpatterns.decorator;

public class ComponentDecoratorImplB extends ComponentDecorator {

    public ComponentDecoratorImplB(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void operate() {
        super.operate();
        System.out.println("Operate component decorator implementation B.");
    }
}
