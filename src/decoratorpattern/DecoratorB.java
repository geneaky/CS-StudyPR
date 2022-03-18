package decoratorpattern;

public class DecoratorB extends Decorator{
    public DecoratorB(Component concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void operation() {
        System.out.println("===decorator B===");
        super.operation();
    }
}
