package visitorpattern;

public class ElementA extends Element{

    private final String name;

    public ElementA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operation() {
        System.out.println("operationB");
    }
}
