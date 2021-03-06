### 컬렉션 처리: 가변 길이 인자, 중위 함수 호출, 라이브러리 지원
- 3.4.1
  - `vararg` 키워드를 사용하면 호출시 인자 개수가 달라질 수 있는 함수 정의 가능하다.
  - 중위 `infix` 함수 호출 구문 사용시 하나뿐인 메서드 호출시 편하다
  - 구조 분해 선언을 사용시 복잡한 값을 분해해서 여러 변수에 나눠 담을 수 있다. 
  - [lesson-3.4.1](lesson3.4.1.kt)

- 3.4.2
  - `vararg` 사용시, java = `...`, kotlin = `*변수명`
  - [lesson-3.4.2](lesson3.4.2.kt)

- 3.4.3
  - 맵 생성 - 함수 `mapOf`
  - 중위 함수 예제 : x `to` y
  - 일반 함수 예제 : x.to(y)
  - 구조 분해 선언: key, 값과 같이 묶여진 데이터의 원소를 개별로 가져올수 있게함 
  - `Pair(x,y)` -> x, y 
  - [lesson-3.4.2](lesson3.4.2.kt)
