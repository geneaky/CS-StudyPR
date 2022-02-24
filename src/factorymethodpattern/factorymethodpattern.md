Factory Method 패턴은 기반 클래스에 알려지지 않은 구체 클래스를 생성하는
Template Method라 할 수 있다. 
Factory Method의 반환 타입은 생성되어 반환되는 객체가 구현하고 있는
인터페이스 이다. 
Factory Method는 또한 기반 클래스 코드에 구체 클래스의 이름을
감추는 방법이기도 하다.
(Factory Method는 부적적할 이름이다.
사람들은 객체를 생성하는 모든 메서드를 자연스레 팩토리 메서드라 부르는 경향이 있음,
이러한 생성 메서드가 모두 Factory Method패턴을 사용하는 것은 아님)

객체를 생성하기 위해 인터페이스를 정의하지만, 어떤 클래스의 인스턴스를 생성할지에 대한
결정은 서브클래스가 내리도록함. 
==
인터페이스에 대한 구현체를 서브클래스에서 선택하도록 함

https://www.baeldung.com/spring-framework-design-patterns

spring의 dependency injection의 근간에 factory method pattern이 들어있음.
근본적으로 스프링은 빈 컨테이너를 빈을 생성하는 factory로 생각함.
따라서 스프링은 `BeanFactory` 인터페이스를 bean container의 
추상체로 정의합니당.
getBean메서드는 메서드가 지원하는 기준과 일치하는 빈을 반환하는 
factory method임.(기준- 타입이나 이름)

spring에서 
beanfactory를 applicationcontext가 확장하는데
applicationcontext는 application configuration을 추가적으로
도입한 것임.
spring은 이 configuration을 사용해서 몇가지 외부 설정을 베이스로
bean container를 시작시킨다. (외부 설정 - xml file or java annotation)

applicationcontext를 구현하는 annotationconfigapplicationcontext오 같은 클래스를 
사용하는 것은 우리가 다양한 factory method를(beanfactory interface에서 상속받음) 통해 빈을 생성할 수 있게 해준다.


