package strategypattern;

public class ContextV2 {

    public void execute(Strategy strategy) {
        System.out.println("start ====== 3");

        strategy.call();

        System.out.println("end ====== 4");
    }
}
