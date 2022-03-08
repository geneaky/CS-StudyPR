package compositepattern;

public class Main {

    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard(10, 200);
        Monitor monitor = new Monitor(20, 200);
        Body body = new Body(30, 300);

        Computer computer = new Computer();
        computer.addComponent(keyBoard);
        computer.addComponent(monitor);
        computer.addComponent(body);

        System.out.println(computer.getPrice());
        System.out.println(computer.getPower());

    }
}
