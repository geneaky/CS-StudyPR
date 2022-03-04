알고리즘 제품군을 정의하고 각각을 캡슐화하여 상호 교환 가능하게 만든 것
전략패턴을 사용하면 알고리즘을 사용하는 클라이언트와 독립적으로 알고리즘을 변경할 수 있다.

변하지 않는 부분(부가 기능)을 context라는 클래스로 구현 해두고 변하는 부분을 strategy라는 인터페이스를 만들고 필요한 형태의 구현체를 원하는 만큼 만들어둔다.
이때 우리가 원하는 기능의 구현은 변하지 않는 부분이 변하는 부분을 '참조'하면서 이루어진다.
이 참조는 interface를 참조하기 때문에 역할에만 집중하게 되어 결합이 약해진다.

spring의 ResourceLoader에서 strategy pattern이 사용되었으며 spring boot로 서버 실행시 
여러 환경 세팅 방식이 있을텐데 (annotation, xml , java config 등등)
ResourceLoader interface의 getClassLoader 메서드를 통해 ClassLoader를 가져오는 방식으로 
사용되었음 