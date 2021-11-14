### 컬렉션과 배열

- 6.3.1
    - 컬레션 제너릭 타입에 `?` 지정한 경우<br>
      원소 변수가 `null` 허용
    - 컬레션 제너릭 타입에 `?` 지정한 경우<br>
    - `filterNotNull` 함수를 통해 원소 null 쉽게 체크 가능
    - [lesson-6.3.1](lesson-6.3.1.kt)

- 6.3.2
    - 코틀린은 컬렉션 내에서 `읽기 전용` `변경 전용` 인터페이스 분리
    - `kotlin.collections.Collection`
        - 컬렉션 `크기` `존재 유무` `데이터 읽는 연산`
        - `추가` `삭제` `수정` 관련 기능은 존재 하지 않음
        - `thread-safe` 하지 않음
    - `kotlin.collections.MutableCollection`
        - `kotlin.collections.Collection` 확장형
        - `추가` `삭제` `수정` 관련 기능 지원
    - [lesson-6.3.2](lesson-6.3.2.kt)

- 6.3.3
    - 컬렉션 생성 함수
        - `List`
            - 읽기 전용: `listOf`
            - 변경 가능: `mutableListOf` `arrayListOf`
        - `Set`
            - 읽기 전용: `setOf`
            - 변경 가능: `mutableSetOf` `hashSetOf` `linkedSetOf` `sortedSetOf`
        - `Map`
            - 읽기 전용: `mapOf`
            - 변경 가능: `mutableMapOf` `hashMapOf` `linkedMapOf` `sortedMapOf`
        - `java` 와 `kotlin`을 서로 참조하려 사용시 <br>
          컬렉션 변경에 따른 파라미터 타입을 신중하게 해야한다.
            - ex) java 에서 변경 가능한 collection 클래스인데 <br>
              kotlin 에서는 변경 불가능한 collection 인 경우

- 6.3.4
    - 자바 컬렉션 api 중 `수정` 가능한 부분 `override` 유의 사항
        - 컬렉션 Null 허용 여부
        - 컬렉션 원소 Null 허용 여부
        - 오버라이드 메서드 컬렉션 변경 가능 여부
    - [lesson-6.3.4](lesson-6.3.4.kt)

- 6.3.5
    - 코틀린 배열
        - `arrayOf` 함수로 배열 생성
        - `arrayOfNulls` 원하는 배열 크기를 인자로 넣는 경우 <br>
          `null` 이고 원소 갯수 만큼 크기의 배열 생성 <br>
          `null`이 가능한 원소 타입만 지원
        - `Arrays` 생성자는 배열 크기와 람다를 인자로 받아서 <br>
          람다 내에서 각 배열 원소를 초기화 <br>
          `null` 이 아닌 각 원소로 구성된 배열 생성시 사용
        - 원시 타입마다 원시 타입 배열 클래스 지원
            - `Int` -> `IntArray` , 자바 `int[]`
            - `Byte` `Char` `Boolean`.... 
            - 박싱하지 않음
        - 원시 타입의 배열 생성 방법
            - 각 배열 타입의 생성자는 size 인자를 받고 <br>
              원자의 타입의 기본값으로 구성된 배열 생성 
            - 팩토리 함수 (`intArrayOf`,..) <br>
              여러 값을 가변 인자로 받아서 배열 생성 
            - 크기, 람다를 인자로 받는 생성자 사용
    - [lesson-6.3.5](lesson-6.3.5.kt)
