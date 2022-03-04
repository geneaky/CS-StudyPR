package strategypattern;

public class Main {

    public static void main(String[] args) {
        Strategy strategy1 = new Strategy1();
        Strategy strategy2 = new Strategy2();
        ContextV1 v1 = new ContextV1(strategy1);

        //여러 strategy중 하나를 선택해서 객체 생성시 주입받아 사용하는 방식과
        v1.execute();

        ContextV2 v2 = new ContextV2();

        //여러 strategy중 하나를 선택해서 객체의 메서드 호출시 사용하는 방식
        v2.execute(strategy2);
    }

}
