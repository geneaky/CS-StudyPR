package proxypattern;

public class Proxy implements Subject{

    Subject realSubject = new RealSubject();

    @Override
    public void doAction() {
        System.out.println("I am Proxy");
        realSubject.doAction();
    }
}
