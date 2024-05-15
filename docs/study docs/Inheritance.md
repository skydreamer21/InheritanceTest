1. Project의 생성으로 본 상속의 문제점
   - 부모 클래스의 변경이 모든 자식 클래스의 변경을 초래한다.
     - 만약 Project 필드가 추가되거나 변경되면?
       - 모든 자식 클래스들의 Constructor 가 수정되어야 한다.

2. `@Builder` 의 사용으로 본 상속의 문제점
   - lombok의 `@Builder`로 생성된 Builder 클래스들은 기존 클래스의 상속 관계를 반영하지 않는다.
   - 결국 부모 클래스들의 필드들의 중복 생성로직을 작성하는 것이나 따로 Builder를 만들어주어야 한다.
   - 부모랑 자식 중 한 군데만 `@Builder` 사용 가능. 
     - [Lombok @Builder 상속](https://velog.io/@mihyun/Lombok-Builder-%EC%83%81%EC%86%8D)
   - 여러 군데의 블로그에서 `@SuperBuilder` 를 상속관계의 `@Builder` 문제점을 해결하는 방법 중에 하나라고 제시하고 있으나 이는 `lombok` 의 `experimental` 패키지에 속한다.
     - 공식문서에 따르면 `Features that involve the annotations and support classes in this package may change or may be removed entirely in future versions, and bugs may not be solved as expediently`
     - 즉 언제 바뀔지 모른다.
     - 진짜 빠른 수정이 필요하고, 이를 빠른 시일 내에 고칠 것이 아니라면 초반 클래스 설계에 이를 포함시키면 안된다.