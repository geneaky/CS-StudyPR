package decoratorpattern;

public class Main {

    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();

        Decorator decoratorA = new DecoratorA(concreteComponent);
        Decorator decoratorB = new DecoratorB(concreteComponent);

        decoratorA.operation();
        decoratorB.operation();
    }
}
