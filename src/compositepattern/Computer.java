package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<ComputerDevice> components = new ArrayList<>();

    public void addComponent(ComputerDevice component) {
        components.add(component);
    }

    public void removeComponent(ComputerDevice component) {
        components.remove(component);
    }

    public int getPrice() {
        int price = 0;
        for(ComputerDevice cd : components) {
            price += cd.getPrice();
        }

        return price;
    }

    public int getPower() {
        int power = 0;
        for(ComputerDevice cd : components) {
            power += cd.getPower();
        }

        return power;
    }

}
