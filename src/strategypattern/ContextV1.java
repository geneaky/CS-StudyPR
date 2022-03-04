package strategypattern;

public class ContextV1 {

    private final Strategy strategy;

    public ContextV1(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        System.out.println("start === 1");

        strategy.call();

        System.out.println("end === 2");
    }

    //strategy를 주입받아 전략을 실행하는 방식
}
