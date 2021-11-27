### 프로퍼티 접근자 로직 재활용: 위임 프로퍼티

- 7.5.1
    - 형태
    ```kotlin
        class Test {
            var p: String by Delegate()
        }
  
       class Delegate {
         operator fun getValue(): String {}
         operator fun setValue() {}   
       }
    ```
    - Test 필드 변수 호출 : Delegate.getValue(...) 호출
    - Test 필드 변수 할당시 : Delegate.setValue(...) 호출
    - [lesson-7.5.1](lesson-7.5.1.kt)

- 7.5.2
  - 위임 프로퍼티 사용: by lazy()
  - 객체를 사용할때마다 초기화 하지 않고, 특정 경우만 초기화\
    `싱글톤 객체 관리때랑 비슷`
  - `val variable by lazy {event}`
  - 다중 스레드 환경에서는 초기화중에도 \
    접근이 가능하기 떄문에 동기화 전략도 필요할듯
  - [lesson-7.5.2](lesson-7.5.2.kt)

- 7.5.3
  - 위임 프로퍼티 구현
  - `PropertyChangeSupport` 필요 인스턴스 저장 \
    리스너 목록 관리`PropertyChangeListener`에서 등록후\
    프로퍼티 변경시 처리 위임하는 방식으로 진행
  - `PropertyChangeSupport` 필요 인스턴스 저장 \
  - `Delegates.observable` lib통해 쉽게 구현 가능  
  - [lesson-7.5.3](lesson-7.5.3.kt)

- 7.5.4
  - 위임 프로퍼티 컴파일 규칙
  - 위읨 프로퍼트 클래스 인스턴스 선언 \
    `var yy: Type by xx()` \
    프로퍼티에 저장되고 컴파일러는 표현하기 위해 `KProperty` 객체 사용 \
  - 프로퍼티 값이 저장될 장소 변경시 유용 \
    `map` `database table` `user cookie`
  - 프로퍼티 값 변경시 유용 \
    `값` `검증` `통지`
  ```kotlin
   val x = c.prop // val x = <delegate>.getValue(c, <property>)  
   c.prop = x // <delegate>.getValue(c, <property>, x)  
  ```
  - [lesson-7.5.4](lesson-7.5.4.kt)

- 7.5.5
  - 프로퍼티 값을 맵에 저장
  - `확장 가능한 객체`라고 부름
  - [lesson-7.5.5](lesson-7.5.5.kt)

- 7.5.6
  - 프레임워크에서 위임 프로퍼티 활용
  - database table - entity 접근시 \
    convention 소개
    ```kotlin
    // table
    object Users: IdTable() {
      val name = varchar("name", length = 50).index()
      val age = integer("age)
    }
    
    // entity
    class User(id: EntityID): EntitY(id) {
      var name: String by Users.name // 위임 프로퍼티
      var age: Int by Users.age // 위임 프로퍼티
    }
    ```
  - [lesson-7.5.6](lesson-7.5.6.kt)
