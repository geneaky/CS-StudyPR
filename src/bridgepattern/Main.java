package bridgepattern;

public class Main {

    public static void main(String[] args) {
        DisplayImpl impl = new StringDisplayImpl();
        Display ds = new Display(impl);
        CountDisplay display = new CountDisplay(impl);

        ds.display();
        display.display();
        display.multiDisplay(3);
    }
}
