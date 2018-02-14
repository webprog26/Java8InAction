/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author webpr
 */
public class StreamOfFile {

    private static final String SOURCE_FILE_MANE = "D:/files/document.json";

    public static final long getUniqueWordsCount() {
        long uniqueWords = 0;
        try (Stream<String> lines = Files.lines(Paths.get(SOURCE_FILE_MANE), Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return uniqueWords;
    }

}
