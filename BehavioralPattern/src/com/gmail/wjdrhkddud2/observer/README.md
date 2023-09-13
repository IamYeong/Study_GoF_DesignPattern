## Observer 패턴

### 설명

- 구독관계를 가리킨다.
- Subject 가 여러 Observer 를 거느리고 알림을 전파한다.
- 특정 이벤트를 중앙관리하면서 하위 클래스에 전파하고 싶을 때 유용하다.
- 예시에서는 Subject 역할인 NewsChannel 을 구현한 NewsA 라는 채널이 있다.
- Observer 역할인 Subscriber 를 구현한 구독자의 종류인
- CommonSubscriber 들은 각자의 ID 를 가지고 뉴스채널에 구독한다.
- 몇명은 구독취소를 한 뒤 채널에서 알림이 발생하면
- 구독중인 구독자들에게 알림이 전파되는 모습을 볼 수 있다.
