package templatemethodpattern;

public abstract class LogTrace {

    public void excute() {
        System.out.println("method start!");
        calll();
    }

    public abstract void calll();
}
