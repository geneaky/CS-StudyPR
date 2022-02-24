package factorymethodpattern.abstractclass;

import java.util.UUID;

public class MainRunner {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");
        card1.use();
        card2.use();
        card3.use();
        for(int i = 0 ; i < 10; i++) {
            System.out.println("학번 생성:  " + UUID.randomUUID().toString().replace("-","").substring(0,9));
        }

    }
}
