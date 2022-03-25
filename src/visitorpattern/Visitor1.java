package visitorpattern;

public class Visitor1 implements Visitor{

    @Override
    public void visit(ElementA elementA) {
        System.out.println("방문만 하는 방식의 비지터 1 첫 번째 ");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("방문만 하는 방식의 비지터 1 두 번째 ");
    }
}
