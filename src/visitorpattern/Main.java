package visitorpattern;

public class Main {

    public static void main(String[] args) {

        Element elementA = new ElementA("AAAA");
        Element elementB = new ElementB("BBBB");

        elementA.accept(new Visitor1());
        elementB.accept(new Visitor1());

        elementA.accept(new Visitor2());
        elementB.accept(new Visitor2());

        //새로운 기능을 확장하고싶으면 새로운 Visitor3를 만들고 Element 클래스와 그 자식 클래스는 건들지않고 accept 메서에 Visitor만 받아서 넘겨주면 안에서 실행시키는 구조
    }
}
