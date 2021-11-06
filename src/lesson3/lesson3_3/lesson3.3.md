### 메서드를 다른 클래스에 추가: 확장 함수와 확장 프로퍼티
- 3.3.1
  - 코틀린은 참조 클래스 대한 확장 함수 선언이 가능하다.
  - 확장 함수 구현시 참조 클래스의 객체에 `this` 사용하지 않아도 됨
  - 확장 함수 `import` 가 가능하고, `as` 통하여 이름을 별도로 설정 가능하다.
  - [lesson-3.3.1](lesson3.3.1.kt)

- 3.3.2
  - 코틀린에서 생성한 확장함수를 자바에서 사용 가능하다.
  - fileName: StringUtils.kt 
  - java > StringUtilsKt.lastChar("Java)

- 3.3.3
  - Collection.joinToString 확장 함수 예제
  - [lesson-3.3.3](lesson3.3.3.kt)
