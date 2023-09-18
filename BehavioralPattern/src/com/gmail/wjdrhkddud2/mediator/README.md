## Mediator 패턴

### 설명

- 구현을 한 뒤 가장 먼저 생각난 사례는 안드로이드의 Activity 와 View Component 였다.
- Activity 코드를 보면 많은 Component 들의 이벤트를
- Mediator 역할을 하는 Activity 가 받아서 제어하고 있다.
- 이벤트를 서로 넘겨줄 수도 있을 것이고 count 처럼 상태를 관리할 수도 있다.
- 여기서 Context - Activity 는
- Mediator, Concrete Mediator 역할이고
- View 와 Component 는 Colleague 와 Concrete Colleague 다.
- Colleague 는 Mediator 를 가지고 있고,
- Mediator 는 Colleague '들' 을 가지고 있어서 관리한다.