# Entity 에서 mapping 함수 VS Dto 에서 mapping 함수 VS 외부 Mapper
1. Entity 에서 mapping 함수
  - Entity 가 dto를 안다.
  - dto 변경이 Entity에 영향을 미친다.

2. Dto 에서 mapping 함수
    - Dto가 Entity를 안다.
    - Dto 전달 계층이 한정되면 로직을 또 써야 함.

3. 외부 Mapper
    - 클래스가 많아진다.
    - Mapping 함수를 한번에 관리할 수 있다.
    - 다른 Mapping 이 필요할 때 기존 코드 수정 없이 추가 구현을 하면 된다.
    - `Component`로 관리하면 인스턴스가 하나만 있으면 된다.