package factorymethodpattern.interfaceclass;

public class NYStyleCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("cheese pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("cheese pizza bake");
    }

    @Override
    public void box() {
        System.out.println("cheese pizza box");
    }
}
