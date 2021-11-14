package lesson6.lesson6_3

import lesson6.lesson6_1.Person
import java.io.File

/**
 * java interface 구현 사항
 * 파일에서 텍스트로 표현 안되는 부분 (이진 파일), 리스트는 null 이 될수 있음
 * 이 리스트는 파일의 내용을 표현 하므로, 수정할 필요 없음
 * 파일의 줄은 null 이 아니므로, 리스트 원소는 not null
 */
class FilterIndexer : FileContentProcessor {
    override fun processorContents(path: File, binaryContents: ByteArray?, textContents: List<String>?) {
        TODO("Not yet implemented")
    }
}

/**
 * input의 데이터에 따라서 결과를 내기 떄문에 (input not null)
 * 호출하는 쪽에서 항상 오류 메시지 받아야 한다. (errors not null)
 * errors 의 원소는 null 될수 있음, output 에 들어가는 정보 (not null)
 */
class FilterDataParser : DataParser<Person> {
    override fun parserData(input: String, output: MutableList<Person>, errors: MutableList<String?>) {
        TODO("Not yet implemented")
    }
}

