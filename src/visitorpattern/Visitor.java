package visitorpattern;

public interface Visitor {

    public void visit(ElementA elementA);

    public void visit(ElementB elementB);
    
    //메서드 오버로딩으로 다형성을 제공
}
