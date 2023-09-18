## Iterator 패턴

### 설명

- Iterator 는 java 의 Collection 에서 자주 볼 수 있다.
- Collection 에는 종류가 많다.
- Key, Value 로 이루어진 Map,
- 순서없는 집합인 Set,
- Root 부터 뻗어있는 Tree,
- 일반적인 배열인 List 등이 있겠다.
- 하지만 Iterator 로 순회하는 방법을 분리하지 않으면
- 인터페이스가 항상 동일하지 않아서 혼란의 여지가 있다.
- 어떤 Collection 이더라도, Iterator 메서드를 호출하면
- Collection 에 맞는 Iterator 를 생성하여
- 동일한 API 로 순회할 수 있게 하는 것이 Iterator 패턴의 핵심이다.
- 확장의 측면에서는 Bridge 패턴과도 비슷한 개념이 보인다.
- 자료구조의 종류와 순회방법을 분리해서 확장할 수 있도록 만들었기 때문이다.
- 해당 예제에서는 언젠가 만들어보고 싶었던 List 의 주요 메서드와
- Iterator 의 핵심 메서드 두 개를 구현해보았다.