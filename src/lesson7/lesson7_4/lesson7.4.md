### 구조 분해 선언과 component 함수

- 7.4.1
    - 객체의 내부 값을 분해해서 다른 변수를 한꺼번에 초기화
        ```kotlin
            val p = Point(10, 20) 
            val (x, y) = p
            println(x) // 10
            println(y) // 20
        ```
    - 초기화 하는 변수에 `componentN` 함수 호출 \
      `N` 변수 위치에 다라 붙는 번호 \
      `val (a, b) = p `
      `val a = p.component1(), val b=p.component2()`
    - 구조 분해 선언을 통해 여러 값을 손쉬게 반환 가능
    - 표준 라이브러리 `Pair` `Triple` 통해 반환 가능
    - 구조 분해 선언과 루프
    ```kotlin
    fun printEntries(map: Map<String, String>) {
      for ((key, value) in map) {
        println("$key -> $value")
      }
    }
    ```
      
    - [lesson-7.4.1](lesson-7.4.1.kt)
