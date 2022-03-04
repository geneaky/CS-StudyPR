package templatecallbackpattern;

public class Template<T> {

    public void execute(String message, CallBack<Void> callBack) {

        System.out.println("start!");

        System.out.println(message);
        callBack.call();

        System.out.println("end!");
    }
}
