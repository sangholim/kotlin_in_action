### in으로 컬렉션, 범위의 원소 검사

- 2.4.1
    - `while` `do-while` java spec 이랑 동일

- 2.4.2
    - `for`  i in 1..y -> 1 ~ y
    - `for i in y downTo 1 step 2` -> y에서 1까지, 감소 값: 2
    - `step` `until` ... 다양한 문법 존재
    - [lesson-2.4.2](lesson2.4.2.kt)
- 2.4.3
    - map -> `key` `value` 로 구성
    - map 할당 -> `param[key] = value`
    - `for` `iteration`  
      for((`key-paramter`, `value-parameter`) in map-parameter)
    - 컬렉션 예제
    - for((`index`, `element`) in list.`withIndex()`)
    - [lesson-2.4.3](lesson2.4.3.kt)
- 2.4.4
    - `p in 'a'..'z'`
      p 값이 'a' 부터 'z' 내에 포함 여부
    - `p !in 'a'..'z'`
      p 값이 'a' 부터 'z' 내에 미포함 여부
    - `p in collection`
      p 값이 collection 내에 포함 여부
    - [lesson-2.4.4](lesson2.4.4.kt)

