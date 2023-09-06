## Bridge 패턴

### 설명

- 쉽게 말하면 2개 이상의 이유로 복잡하게 확장되는 객체를 막기 위해서
- 확장의 원인을 나누는 방법이다. 이를 추상의 분리 라고 표현한다.
- 예제 코드만 보더라도 만약 브릿지 패턴을 쓰지 않았다면
- Furniture 클래스를 WoodChair, LeatherChair 처럼 필요한 만큼 과하게 늘어날 것이다.
- Furniture 는 가구 종류가 늘어났을 때만 클래스를 확장하고,
- Material 은 재료의 종류가 늘어났을 때만 인터페이스를 추가로 구현한다.
- Furniture 는 'Abstraction' 이라 표현된다.
- Material 은 'Implementor' 라고 표현된다.
- Furniture 를 확장한 객체들은 'RefinedAbstraction',
- Material 을 구현한 객체들은 'ConcreteImplementor' 역할이다.
- Furniture 가 Material 의존성을 주입받아서 클라이언트 기준 방향성을 효과적으로 제어할 수 있고,
- 확장에 대해 유연하게 대처할 수 있다.
