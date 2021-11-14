### 코틀린 원시 타입

- 6.2.1
    - 코틀린은 원시 타입, 래퍼 타입을 구분하지 않음

- 6.2.2
    - 코틀린에서 `null`이 가능한 원시타인 선언시 <br>
      자바에서는 래퍼 클래스로 매핑
    - 배열에서 원소 타입이 원시타입 사용시 <br>
      자바에서는 `generic` 래퍼 클래스로 반환된다.

- 6.2.3
    - 코틀린에서는 다른 타입의 숫자를 자동 반환 하지 않음 `auth-cast`
    ```kotlin
    val i = 1 // int
    val l:Long = i // Error: type mismatch 컴파일 에러
    val m:Long = i.toLong() // ok
    
    val list = listOf(1L, 2L, 3L)
    // 묵시적 형변환 되지 않음
    // compile error
    x in list = false
    // 형변환 후 비교
    x.toLong() in list = true 
    ```
    - 변수 선언시 원시타입 리터럴을 선언시<br>
      형변환을 해야할 경우가 줄어듬
    - `+` Byte, Long 을 인자로 받을 수 있음
    - [lesson-6.2.3](lesson-6.2.3.kt)

- 6.2.4
    - `Any`: 최상위 타입 자바의 `Object` 와 흡사
    - 코틀린에서는 원시 타입 또한 최상위 조상 타입이다.
       ```
      // java
      Object value = 1;
      Integer toNumber = (Interger)value;
      
      // kotlin
      // 원시 타입 또한 최상위 조합이므로 auto-boxing됨
      val answer: Any = 42
       ``` 
    - `Any` Null 이 될 수 없는 타입
    - 내부에서 `Any`는 java.lang.Object 에 대응

- 6.2.5
    - 코틀린 `Unit` = 자바 `void`
      `fun f() : Unit {...}`
      `fun f() {...}`
        - `Unit` 함수를 자바에서 사용시 `void` 로 컴파일
        - `void` 와는 달리 `Unit`를 타입으로 명시가 가능하다.
        - interface 구현 클래스의 제너릭이 `Unit` 인 경우 <br>
          오버라이드 함수의 반환 타입 지정할 필요 없음 <br>
          `return 값` 선언할 필요 없음
        - java 제너릭이 `Void` 인경우, 오버라이드 메서드에서 <br>
          반환 값을 `return null` 해줘야 하는 번거로움이 있음
    - [lesson-6.2.5](lesson-6.2.5.kt)

- 6.2.6
    - `Nothing`
        - 정삭적으로 처리가 끝나지 않을때 반환하는 타입
        - 전제 조건 검사시 실패하는 경우, 변수로 할당이 가능
    - [lesson-6.2.6](lesson-6.2.6.kt)        
