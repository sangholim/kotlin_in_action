### 자바 함수형 인터페이스 활용

- 5.4.1
    - 자바 메서드 람다 예제
        ```java
        public class Button {
            public void setOnClickListener(OnClickListener l) {}
        }

        public interface OnClickListener {
            void onClick(View view); 
        }      
 
        // Button 객체 생성후 구현시
        /*
        button.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View view) {
             // ....
          }         
        })
        - 코틀린 예제
        // button.setOnClickListener{view -> {...}}
        */
        ```
    - `SAM` 인 인터페이스에서만 가능 (단일 추상 인터페이스)
    - 자바 메서드에 람다를 인자로 전달
    - [lesson-5.4.1](lesson-5.4.1.kt)

- 5.4.2
    - 람다내에서 SAM 인터페이스의 객체를 반환하는 경우 SAM 생성자를 만들어서 반환한다
    - 이벤트 리스너를 람다 자체로 구현시 `등록/해제` 불가능
    - 이벤트 리스너를 람다가 구현된 객체일떄  `등록/해제` 가능
    - [lesson-5.4.2](lesson-5.4.2.kt)
