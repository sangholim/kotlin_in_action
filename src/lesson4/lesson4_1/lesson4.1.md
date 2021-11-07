### 클래스 계층 정의
- 4.1.1
  - 'sealed' -> 클래스 상속제한
  - 코틀린 인터페이스는 java에서 사용하는거랑 흡사
  - 함수 선언시 default 값 설정 가능
  - 다중 인터페이스에서 선언된 함수를 선택해서 사용 가능 
  - [lesson-4.1.1](lesson4.1.1.kt)

- 4.1.2
  - `final` > 오버라이드 불가능
  - `open` > 상속이 가능하다.
  - `abstract` > 반드시 상속
  - `override` > 상속받은 클래스 내에서는 상속 가능  
  - [lesson-4.1.2](lesson4.1.2.kt)

- 4.1.3
  - 가시성 변경자 > 클래스 구현 접근을 제한
  - `default` = `public` 
  - `internal` > 같은 파일`모듈`내에서 접근이 가능 
  - `protected` > 같은 패키지 내에서라도 하위 클래스 선언된 곳에서만 접근 가능
  - [lesson-4.1.3](lesson4.1.3.kt)
  
- 4.1.4
  - 중첩 클래스 (바깥쪽 클래스에 대한 참조를 저장 하지 않음)
    - 자바 > static class A 
    - 코틀린 > class A
  - 내부 클래스 (바깥쪽 클래스에 대한 참조를 저장)
    - 자바 > class A
    - 코틀린 > inner class A
  - [lesson-4.1.4](lesson4.1.4.kt)

- 4.1.5
  - `sealed` > 상속을 하는 하위 클래스 정의를 제한 할수있음
  - [lesson-4.1.5](lesson4.1.5.kt)

