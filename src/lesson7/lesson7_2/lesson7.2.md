### 비교 연산자 오버 로딩

- 7.2.1
    - 동등성 연산자 `equals`
      - a 널이 아닌 경우 a.equals(b)
      - a 널인 경우 b 널인지 체크, \
        a == null 이면 b가 null 이면 true
      ```kotlin
        a == b > a?.equals(b) ?: (b == null)
      ```
      - 구현시 `==` `!=` (null 포함) 연산자를 사용할 수 있음
    - [lesson-7.2.1](lesson-7.2.1.kt)

- 7.2.2
    - 순서 연산자`compareTo`
        - 함수 구현시 `>` `<` `>=` `<=` 연산자 사용 가능
      ```kotlin
        a >= b - a.compareTo(b) >= 0
        a > b - a.compareTo(b) > 0
        a <= b - a.compareTo(b) <= 0
        a < b - a.compareTo(b) < 0
      ```
    - `Comparable` 인터페이스 내에 \
      `operator` 선언이 되어 있어 붙일 필요 없음
    - [lesson-7.2.2](lesson-7.2.2.kt)
