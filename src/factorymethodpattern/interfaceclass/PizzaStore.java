package factorymethodpattern.interfaceclass;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type); // factory method
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    // factory method - 어떤 피자를 만들지에 대한 구현은 서브 클래스에서 진행
    protected abstract Pizza createPizza(String type);
}
