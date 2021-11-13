### 람다식, 멤버 참조

- 5.1.1
    - 무명 내부 클래스 구현시 예제 소개
    ```jsonc
      /* 자바 */
      button.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
        /* 실행 동작*/
        }
      })

      /* 코틀린 */
      button.setOnClickListener{/* 클릭시 실행 동작 */}  
    ```

- 5.1.2
  - 람다를 사용해 컬렉션 검색
  - 멤버 참조를 사용해 컬렉션 검색하기
  - collection - maxBy 람다 예제  
  - [lesson-5.1.2](lesson-5.1.2.kt)

- 5.1.3
  - 람다식 기본 문법
    ```jsonc
      (파라미터)          (본문)
      {x: Int, y: Int -> x+y}
    ```
  - 람다식 사용은 성능에 영향을 끼치지 않음
  - 구현된 람다식 사용시에 `paramter type`을 반드시 사용할 필요 없음  
  - 형식1: function(){}
  - 형식2: function({})
  - 형식3: function{}
  - [lesson-5.1.3](lesson-5.1.3.kt)

- 5.1.4
  - 함수 파라미터를 람다 안에서 사용하기
  - 람다 안에서 바깥 함수의 로컬 변수 변경하기 `포획변수`
    - 람다를 호출하는 함수가 비동기인 경우 `포획변수` 값은 다르게 나올수 있음
  - [lesson-5.1.4](lesson-5.1.4.kt)

- 5.1.5
  - 멤버 참조 문법 `::`
    ```jsonc
     (클래스) (멤버)
      Person::age
    ```
  - 확장 함수에서 멤버 참조 가능
  - 바운드 멤버 참조 `TODO`
  - [lesson-5.1.5](lesson-5.1.5.kt)
