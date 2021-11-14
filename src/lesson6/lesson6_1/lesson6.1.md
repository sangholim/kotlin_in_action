### 코틀린 타입 시스템

- 6.1.1
    - 일반 함수 사용시 `null` 인자를 사용시 컴파일 오류 발생
    - 인자 타입 뒤에 `?` 명시하는경우 <br>
      null 값을 받을수 있지만, 내부 로직에서 null 처리가 필요하다. <br>
      `fun method(param: type?) = ...`
    - [lesson-6.1.1](lesson-6.1.1.kt)

- 6.1.2
    - 코틀린에서는 null 될수 있는 타입, 없는 경우 타입을 핸들링 가능

- 6.1.3
    - `?.`
        - null 검사, 메서드 호출을 한번의 연산으로 수행
        - example
        ```
           - java
            if(s != null) s.toUpperCase() else null

           - kotlin
            s?.toUpperCase()
       
        ```
        - `property` 에서도 사용 가능
    - [lesson-6.1.3](lesson-6.1.3.kt)

- 6.1.4
    - `?:`
        - `null` 대신 사용할 `default` 사용할수 있는 연산자
        - 함수의 전제조건을 확인시 유용하다.
    - [lesson-6.1.4](lesson-6.1.4.kt)

- 6.1.5
    - `as?`
        - castType 이 아닌 경우 `null` 반환
    - [lesson-6.1.5](lesson-6.1.5.kt)

- 6.1.6
    - `!!`
        - null 일떄 NPE 발생
        - `a.b!!.c!!.d` 같이 단언문을 한문장에<br>
          여러번 사용하지 말자
    - [lesson-6.1.6](lesson-6.1.6.kt)

- 6.1.7
    - `let` 함수
        - `xx.let{}`
        - 이전 호출자의 값이 not null > 람다 수행
        - 이전 호출자의 값이 null > 람다 미수행
    - [lesson-6.1.7](lesson-6.1.7.kt)

- 6.1.8
    - `lateInit` 초기화 함수
        - 클래스의 초기화시 사전 체크 (null)를 손쉽게 해결
        - DI 프레임워크에서는 적용중임
    - [lesson-6.1.8](lesson-6.1.8.kt)

- 6.1.9
    - 널이 될 수 있는 타입 확장
        - null 체크를 위한 예비어를 사용하지 않고 <br>
          확장 함수로 지원
        - ex) string.isNullOrBlank()
    - [lesson-6.1.9](lesson-6.1.9.kt)

- 6.1.10
    - 타입 파라미터를 사용하는 경우, <br>
      파라미터가 `null`이면, <br>
      타입 파라미터값을 `null` 로 받을 수 있음
    - 타입 파라미터를 받을 떄 상한을 지정하는 경우 <br>
      `null` 값을 받지 않게 수행 가능
    - [lesson-6.1.10](lesson-6.1.10.kt)

- 6.1.11
    - 플래폼간 `java <> kotlin` <br>
      null 가능성 지원을 하지 않음
    - `kotlin` 에서 이해 가능한 `java annotaion` <br>
      `@Nullable` `@NotNull` <br>
    - 플래폼 타입 > `kotlin` 널 관련 정보를 알수 없는 타입 
    - java class 사용시 null safe 하게 작업할 필요가 있음 
    - [lesson-6.1.11](lesson-6.1.11.kt)
