package decoratorpattern;

public class DecoratorA extends Decorator{


    public DecoratorA(Component concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void operation() {
        System.out.println("===Decorator A===");
        super.operation();
    }
}
