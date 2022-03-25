package facadepattern;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.startComputer();

        //우리는 이렇게 간단하게 컴퓨터 클래스가 제공해주는 startComputer 메서드를 간편한 인터페이스로 사용하면됨
    }
}
