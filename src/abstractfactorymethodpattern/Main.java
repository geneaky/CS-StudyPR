package abstractfactorymethodpattern;

import abstractfactorymethodpattern.factory.AvanteFactory;
import abstractfactorymethodpattern.factory.CarFactory;
import abstractfactorymethodpattern.factory.SonataFactory;

public class Main {

    public static void main(String[] args) {
        CarFactory factory1 = new AvanteFactory();
        CarFactory factory2 = new SonataFactory();

        Car avante = new Car(factory1.createFrame(), factory1.createWheel());
        Car sonata = new Car(factory2.createFrame(), factory2.createWheel());

        System.out.println("avante ============");
        avante.getFrame().shape();
        avante.getWheel().size();

        System.out.println("sonata ============");
        sonata.getFrame().shape();
        sonata.getWheel().size();

    }
}
