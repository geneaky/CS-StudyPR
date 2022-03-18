package decoratorpattern;

public class Decorator implements Component{

    private final Component concreteComponent;

    public Decorator(Component concreteComponent) {
        this.concreteComponent = concreteComponent;
    }

    @Override
    public void operation() {
        concreteComponent.operation();
    }
}
