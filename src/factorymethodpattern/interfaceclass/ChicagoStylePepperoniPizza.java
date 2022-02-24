package factorymethodpattern.interfaceclass;

public class ChicagoStylePepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("chicago pepperoni pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("chicago pepperoni pizza bake");
    }

    @Override
    public void box() {
        System.out.println("chicago pepperoni pizza box");
    }

}
