package templatecallbackpattern;

public class Main {

    public static void main(String[] args) {
        Template<Void> template = new Template<>();

        template.execute("hi", () -> {
            System.out.println("hello");
            return null;
        });
    }
}
