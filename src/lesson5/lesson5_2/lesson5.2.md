### 컬렉션 함수형 API

- 5.2.1
    - list.filter
        - 컬렉션 데이터를 특정 조건에 따라 걸러냄
          `list.filter{expression}`
    - list.map
        - 컬렉션 데이터 형태를 변환시 사용
    - filter, map 조합하여 사용 가능
    - `!!` NPE 발생 오퍼레이터
    - `map` class 생성 방법
        - `mapOf(key to value, ...)`
    - [lesson-5.2.1](lesson-5.2.1.kt)

- 5.2.2
    - `all` 모든 원소가 술어에 만족여부
    - `any` 술어에 만족하는 원소가 하나있는지 여부
    - `count` 술어에 만족하는 갯수
    - `find` 술어에 만족하는 원소 찾으면 반환 (하나)
    - [lesson-5.2.2](lesson-5.2.2.kt)

- 5.2.3
    - `groupBy` 특정 파라미터에 따라 맵으로 반환
    - [lesson-5.2.3](lesson-5.2.3.kt)

- 5.2.4
    - `flatMap` 
      - 주어진 람다를 컬렉션 객체에 먼저 적용후 여러 리스트들을 한 리스트로 모음
    - `flatten`
      - list 내에 list 원소를 단읠 원소로 변경하는 작업
    - [lesson-5.2.4](lesson-5.2.4.kt)
