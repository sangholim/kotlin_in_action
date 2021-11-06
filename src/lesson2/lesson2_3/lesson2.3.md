### 선택 표현과 처리: enum 과 when
- 2.3.1
  - enum class `xxx` 를 통해 생성 
  - `생성자` `프로퍼티` 선언
  - 상수 정의시 선언한 `프로퍼티` 값을 지정해야 한다.
  - 메서드 정의시 마지막 선언한 상수에 뒤에 `세미콜론` 선언

- 2.3.2 ~ 2.3.3
  - enum class `xxx` 를 통해 생성
  - `switch` -> `when` 문법을  사용
  - `case:` `break` 표현을 쓰지 않는다.
  - 분기 조건시 다중 파라미터 핸들링하기 수월하다.
  - 다중 파라미터 비교시 setOf 같이 인스턴스 만드는 경우는 비 효율 적임
  
- 2.3.4
  - `when` 인자를 사용하지 않고 분기 마다 조건문을 구현하여 사용 가능
  - 가독성 떨어짐

- 2.3.5
  - interface 구현할 클래스는 `class : interface` 로 선언
  - 클래스 형태 체크: `instanceof` -> `is`
  - 클래스 캐스팅: `as 클래스이름`
  - `스마트 캐스팅` -> 파라미터는 체크된 클래스 형태로 캐스팅되어 사용 가능

- 2.3.6
  - when 문법에서 클래스 형태 체크(`is` class) 가능, 
    해당 파리미터는 캐스팅되어 사용 가능 `스마트 캐스팅`

- 2.3.7
  - when 내부 조건에서 블록 처리하여 구현 가능