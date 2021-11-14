package lesson6.lesson6_3;

import java.io.File;
import java.util.List;

public interface FileContentProcessor {
    void processorContents(File path, byte[] binaryContents, List<String> textContents);
}
