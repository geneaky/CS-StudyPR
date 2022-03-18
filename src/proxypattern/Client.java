package proxypattern;

public class Client {
    Subject subject = new Proxy();

    public void start() {
        subject.doAction();
    }
}
