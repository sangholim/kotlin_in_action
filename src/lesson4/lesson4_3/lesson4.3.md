### 컴파일러가 생성한 메서드: 데이터 클래스, 클래스 위임
- 4.3.1
  - 코틀린에서도 `toString` `equals` `hashCode` .. 등 구현 가능 
  - [lesson-4.3.1](lesson4.3.1.kt)

- 4.3.2
  - `data` 클래스 선언시 자바에서 요구하는 모든 메서드를 포함
    - `equals` `hashcode` `toString` `copy`
  - `data` class의 프로퍼티는 불변형을 권장함
  - [lesson-4.3.2](lesson4.3.2.kt)

- 4.3.3
  - 상속을 허용하지 않는 클래스에 새로운 동작을 추가해야 할때
    `decorator` 패턴을 사용한다.
  - `decorator` > 가존 클래스를 대신 사용할 새 클래스 생성,
                  비슷한 필드를 유지하고, 새로 추가할 기능은 새로 정의
  - `by` 키워드를 통해 기존 클래스 스펙을 그대로 유지할수 있다.  
  - [lesson-4.3.3](lesson4.3.3.kt)
