package factorymethodpattern.interfaceclass;

public class NYStylePepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("pepperoni pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("pepperoni pizza bake");
    }

    @Override
    public void box() {
        System.out.println("pepperoni pizza box");
    }
}
