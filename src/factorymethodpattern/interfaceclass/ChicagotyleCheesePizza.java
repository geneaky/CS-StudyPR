package factorymethodpattern.interfaceclass;

public class ChicagotyleCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("chicago cheese pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("chicago cheese pizza bake");
    }

    @Override
    public void box() {
        System.out.println("chicago cheese pizza box");
    }
}
