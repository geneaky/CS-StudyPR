package visitorpattern;

public class Visitor2 implements Visitor{
    @Override
    public void visit(ElementA elementA) {
        System.out.println("OCP 방식으로 새로운 기능을 확장할 수 있는 비지터다 " + elementA.getName());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("OCP 방식으로 새로운 기능을 확장할 수 있는 비지터다 " + elementB.getName());
    }
}
