package proxypattern;

public class RealSubject implements Subject{
    @Override
    public void doAction() {
        System.out.println("I am Real");
    }
}
