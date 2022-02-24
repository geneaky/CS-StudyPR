package factorymethodpattern.interfaceclass;

public class ClientRunner {

    static PizzaStore nyStore = new NYPizzaStore();
    static PizzaStore chicagoStore = new ChicagoPizzaStore();

    public static void main(String[] args) {
        Pizza pizza1 = nyStore.orderPizza("cheese");
        Pizza pizza2 = chicagoStore.orderPizza("pepperoni");

        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
