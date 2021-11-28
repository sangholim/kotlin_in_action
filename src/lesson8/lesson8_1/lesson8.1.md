### 고차 함수: 파라미터와 반환 값으로 람다 사용

#### 고차 함수
- 함수를 인자로 받거나 반환하는 함수 `filter, ...`

- 8.1.1
    - 함수 타입
      ```kotlin
      // int 파라미터 2개 받아서 int 값을 반환하는 함수
      val sum: (Int, Int) -> Int = { x, y -> x+y } 
      
      // 파라미터, 반환 값을 받지 않는 함수
      val action: () -> Unit = {println(42)} 
      
      // 반환 타입이 null 될 수 있음
      var canReturnNull: (Int, Int) -> Int? = {x,y -> null}
      
      // 함수 타입 전체가 null 될 수 있음
      var funOrNull: ((Int, Int) -> Int)? = null
            
      // 파라미터 이름과 함수 타입
      fun performRequest(
        url: String,
        callback: (code: Int, content: String) -> Unit
      ) {
        /*..*/
      }
      var url = "http://kotl.in"
      // API에서 제공하는 이름을 람다에 사용 가능
      performRequest(url) {code, content -> /*..*/}
      // 다른 파라미터명 사용 가능 
      performRequest(url) {code, page -> /*..*/} 
      
      //  [파라미터 타입]   [반환 타입]
      // (Int, String) -> Unit
      ```
    - [lesson-8.1.1](lesson-8.1.1.kt)

- 8.1.2
    - 인자로 받은 함수 호출
    - 술어 함수를 파라미털로 받는 `filter` 함수 정의
      ```kotlin
      /*
        - String: 수신 객체 타입
        - predicate: 파라미터명
        - (Char) -> Boolean: 함수 타입
        - Char -> 파라미터로 받는 함수의 파라미터 타입
        - Boolean -> 파라미터로 받는 함수의 반환 타입
      */
        fun String.filter (predicate: (Char) -> Boolean): String
      ```
    - [lesson-8.1.2](lesson-8.1.2.kt)

- 8.1.3
    - 자바에서 코틀린 함수 타입 사용
      - 코틀린의 함수 타입은 자바에서 `interface` 로 변경
      - 함수 인자의 개수에 따라 아래처럼 인터페이스 제공 \ 
        Function0<R> `인자 없음` \
        Function1<P1, R> `인자 없음` ... \
        인터페이스 내에 `invoke` 호출시 함수 실행
        ```kotlin
        // kotlin에서 함수 타입 선언
        fun processTheAnswer(f: (Int) -> Int) {
            println(f(42))
        }
        // JAVA 에서 실행
        // processTheAnswer(number -> number + 1);
        ```
        
      - 자바에서는 확장 함수 호출시 코드가 지저분함
        
        ```javac
        List<String> strings = new ArrayList();
        strings.add("42");
        CollectionsKt.forEach(strings, s -> {
            System.out.println(s);
            return Unit.INSTANCE;
        });
        ```
      - [lesson-8.1.3](lesson-8.1.3.kt)

- 8.1.4
    - 디폴트 값을 지정한 함수 타입 파라미터나 널이 될 수 있는 함수 타입 파라미터
      - `joinToString` 함수 구현 및 함수 타입을 이용한 개선 \
        `element` 문자열 받는 람다 추가
      - 람다 함수 인자로 받는 경우 Null Safe 패턴 추가시 \
        `invoke` 함수 호출후 Null 처리한다.
    - [lesson-8.1.4](lesson-8.1.4.kt)

- 8.1.5
    - 함수를 함수에서 반환
        - 프로그램 상태나 다른 조건에 따라 달라질 수 있는\
          조건에서 많이 쓰임 \
        ex) 배송 수단에 따라 배송비 계산
            UI 코드에서 사용 예제       
    - [lesson-8.1.5](lesson-8.1.5.kt)
    
- 8.1.6
    - 람다를 활용한 중복 제거
        - ex) 웹사이트 방묵 기록 분석
    - [lesson-8.1.6](lesson-8.1.6.kt)
