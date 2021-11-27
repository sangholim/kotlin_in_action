### 연산자 오버로딩과 기타 관례

#### 함수명 선언에 따른 기능 지원
- 클래스 내에 메서드 명이 `plus`인 경우, 인스턴스에 대해 `+` 연산자 지원 


#### 산술 연산자 오버로딩

- 7.1.1
    - 함수 생성시 `operator` 키워드는 필수
    - `operator fun plus(other A)...` \
      `class a = A(), class b = A()`  \
      `a + b  = a.plus(b)`
    - 오버로딩 지원하는 이항 산술 연산자
      `a * b = times` \
      `a + b = plus` \
      `a - b = minus` \
      `a / b = div` \
      `a % b = mod`
  - 연산자 정의시 두 피연산자가 같은 타입이 아니어도 가능하다.
  - 연산자 정의시 결과 타입이 두 피연산자 중 하나와 일치할 필요 없음
  - `operator` 함수도 오버 로딩이 가능
  - 비트 연산자는 연산자 함수를 사용하지 않음
    `shl - 왼쪽 시프트 (java <<)` \
    `shr - 오른쪽 시프트 (부호 비트 유지, java >>)` \
    `ushr - 오른쪽 시프트 (부호 비트 = 0, java >>>)` \
    `and - 비트 곱(자바 &)` \
    `or - 비트 합(자바 |)` \
    `xor - 비트 배타(자바 ^)` \
    `inv - 비트 반전(자바 ~)`
  - [lesson-7.1.1](lesson-7.1.1.kt)

- 7.1.2
    - 복합 대입 연산자 > `+=, -=, ...`
    - 변강 가능한 컬렉션에 원소를 추가할때
    - 함수명: `plusAssign`, `minusAssign` \
      반환 타입: `Unit`,   
    - `+=` `plus` `plusAssign` 양쪽으로 컴파일 할수 없음    
      - 변수 반환시 `var` 대신 `val` 해결 가능
      - 설계시 `plus` `plusAssign` 연산을 동시에 정의하지 않기
      ```
      a += b > a.plus(b)
      a += b > a.plusAssign(b)
      ```
    - 타입이 같은 컬렉션, 컬렉션의 원소는 복합 대인 연산을 지원
    - [lesson-7.1.2](lesson-7.1.2.kt)

- 7.1.3
    - 단항 연산자 오버로딩 > `-x` `+x`
    - 오버 로딩 가능한 단항 산술 연산자
      `+a > unaryPlus` \
      `-a > unaryMinus` \
      `!a > not` \
      `++a, a++ > inc` \
      `--a, a-- > dec`
    - [lesson-7.1.3](lesson-7.1.3.kt)


