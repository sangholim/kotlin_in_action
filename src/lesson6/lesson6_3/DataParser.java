package lesson6.lesson6_3;

import java.util.List;

public interface DataParser<T> {
    void parserData(String input, List<T> output, List<String> errors);
}
