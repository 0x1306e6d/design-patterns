package dev.gihwan.designpatterns.decorator;

public abstract class ComponentDecorator implements Component {

    private Component decoratedComponent;

    protected ComponentDecorator(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public void operate() {
        decoratedComponent.operate();
    }
}
