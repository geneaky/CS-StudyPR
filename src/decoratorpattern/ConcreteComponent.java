package decoratorpattern;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("I AM Concrete Component");
    }
}
