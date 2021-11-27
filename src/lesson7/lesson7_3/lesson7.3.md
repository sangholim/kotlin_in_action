### 컬렉션과 범위에 대해 쓸 수 있는 관례

- 7.3.1
    - 인덱스로 원소에 접근 `get` `set`
        - 맵의 원소 접근: `val value = map[key]`
        - 맵의 원소 변경: `mutableMap[key] = newValue`
        - 메소드 파라미터 제한이 없음 `String` `Char` `Boolean` `Collection`, ...
        - matrix 형태 접근
        ```kotlin
            operator fun get(rowIndex:Int, colIndex: Int) 
            = matrix[x, y] 
        ```
        - 각 괄호: `x[a, b] = c > x.set(a, b, c)`
    - [lesson-7.3.1](lesson-7.3.1.kt)

- 7.3.2
    - 컬렉션에 객체가 들어 있는지 확인 `in`
        - `contains` 에 대응됨
        `a in c > c.contains(a)`
    - [lesson-7.3.2](lesson-7.3.2.kt)

- 7.3.3
    - 범위 만들기 `rangeTo`
        - `start..end > start.rangeTo(end)`
        - forEach 같은 식에는 컴파일이 안됨 \
          아래 처럼 작업해야함
          `(0..n).forEach{}`
    - [lesson-7.3.3](lesson-7.3.3.kt)

- 7.3.4
    - for 루프: `iterator`
      - `for (x in list){...} > list.iterator() > hasNext, next`
      - `operator`를 통해 `iterator` 재구현 가능
        ```kotlin
        operator fun CharSequence.iterator(): CharIterator
        = for (c in "abc") {}
        ```
    - [lesson-7.3.4](lesson-7.3.4.kt)
