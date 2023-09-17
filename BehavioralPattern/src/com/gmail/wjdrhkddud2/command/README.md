## Command 패턴

### 설명

- 커맨드패턴은 말그대로 커맨드(특정 요청,명령)를 객체형태로 전송하는 것이다.
- 커맨드를 인터페이스로 묶을 수 있고,
- 적용하지 않았을 경우 메서드가 많아지거나 복잡해지는 경우 사용할 수 있겠다.
- 블로그를 찾아보다가 알았지만, Android 때 자주 썼던 Runnable 이 해당 케이스라고 한다.
- Concrete Command 가 (new Runnable({ ... })) 에 해당한다.
- Command 패턴에는 Command, Concrete command, Invoker, Receiver 가 존재한다.
- 예제에서는 Mouse 가 Invoker,
- Command 는 이름그대로, LeftClick, RightClick 이 Concrete command,
- Receiver 를 구현한 모니터들이 Receiver 다.
- 커맨드패턴의 흐름은 한 곳에서 커맨드가 발생하고 각기 다른 리시버로 흐른다.
- Command 에 특정 데이터를 담아서 전달할 수도 있을 것이다.