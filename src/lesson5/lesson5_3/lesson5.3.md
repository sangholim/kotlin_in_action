### 지연 연산 (lazy) 컬렉션 연산

- 5.3.1
    - 즉시 연산
        - 연산이 계산 중간의 결과를 새로운 컬렉션에 담음
        - `list.filter` `list.map`
        - `ex) list.filter.map`
            - filter 시 리스트 생성, map 시 리스트 생성
    - 지연 연산 `sequence`
        - java `stream` 과 비슷한 개념 `병렬 연산`
        - 중간 임시 컬렉션을 사용하지 않고 컬렉션 연산을 수행 할수 있음
        - `ex) list.asSequence.filter.map.toList`
            - sequence로 만들어 filter, map 연산 수행
            - sequence를 list로 변환 (iteration -> collection)
        ```jsonc
                     (중간 연산)             (최종연산)
            sequence.map {...}.filter {...}.toList()
        ```
        - `ex2) list.asSequence.map.find`
        ```jsonc
            [1, 2, 3, 4, 5] 에서 각 원소 제곱값중 3보다 큰수 찾기
            eager  
            [1, 2, 3, 4, 5] -> [1, 4, 9, 16, 25] -> 4
            lazy
            [1, 2, 3, 4, 5] -> [1] -> X
                            -> [4] -> 4 (종료)
        ```    
    
    - [lesson-5.3.1](lesson-5.3.1.kt)

- 5.3.2
    - sequence 생성 함수 - `generateSequence`
    - [lesson-5.3.2](lesson-5.3.2.kt)
