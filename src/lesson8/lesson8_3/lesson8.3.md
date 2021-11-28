### 고차 함수 안에서 흐름 제어

- 8.3.1
    - 람다 안의 `return`문: 람다를 둘러싼 함수로부터 반환 \
      람다로부터 반환되고, 람다를 호출하는 함수를 끝내고 반환 \
      `non-local`: 반환되는 블록보다 더 바깥에 블록도 반환 되는 경우
      ```
      {
        {
            return // 리턴후 블록 종료
        }
        // 안족 블록이 반환후 종료
      } 
      ```
      람다를 인자로 받는 인라이닝 함수인 경우만 해당 
    - [lesson-8.3.1](lesson-8.3.1.kt)

- 8.3.2
    - 람다로부터 반환: 레이블을 사용한 `return` \
      `label`: 람다식 내에서 `return` 처리 가능 \
      루프인 경우는 `break` 역활을 수행
      ```kotlin
                      // 람다 레이블
        people.foreach label@{
                                    // return 식 레이블
            if (it.name == "Alice") return@label
        }
    - 인라임 함수 이름을 레이블로 사용 할 수 있음 \
      ```kotlin
        people.foreach{
            if (it.name == "Alice") return@forEach
        }
    - 람다식에는 레이블이 2개이상 들어 갈 수 없다
    - [lesson-8.3.2](lesson-8.3.2.kt)

- 8.3.3
    - 무명 함수: 함수 람다 내에서 `return` \ 
      할 부분이 많을떄 사용 
    ```kotlin
     // anonymous function 
     fun lookForAlice(people: List<Person>) {
        // return 수행시 lookForAlice 함수는 참조하지 않아 안전 
       people.forEach(fun(person) {
           if(person.name == "Alice") return
            println("Success") 
       })
     }
  
     // non anonymous function  
     fun lookForAlice(people: List<Person>) {
        // return 수행시 lookForAlice 함수또한 반환된다. 
       people.forEach{
           if(it.name == "Alice") return
            println("Success") 
       }
     }
    
    ```
      
