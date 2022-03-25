package visitorpattern;

public class ElementB extends Element{

    private final String name;

    public ElementB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("operationB");
    }
}
