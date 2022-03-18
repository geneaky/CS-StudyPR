데코레이터 패턴은 어떤 객체에 책임(기능)을 동적으로 추가하는 패턴
말그대로 장식을 한다고 생각하면됨

기본 기능을 가지고 있는 클래스에 다른 기능을 추가하기 편하도록 설계하는 패턴

기존 코드를 수정하지 않고도 데코레이터 패턴을 통해 행동을 확장할 수 있고
상속과 합성을 통해 데코레이터는 합성으로 실제 객체를 참조하고
이 데코레이터를 상속하는 다양한 데코레이터를 만들어서 각각의 방식대로 기능을 추가하는 패턴이고

The Spring Framework uses the Decorator design pattern 
to build important functionalities such as transactions, 
cache synchronization, and security-related tasks