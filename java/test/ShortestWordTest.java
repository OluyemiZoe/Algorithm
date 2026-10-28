import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordTest {
    @ParameterizedTest
    @CsvSource({
            "I am a Lady,I",
            "My name is Yemi,My",
            "Pankys Madik is my guy, is"

    })
    public void TestToFindTheShortestWord(String sentence, String expected) {
        ShortestWord shortestWord = new ShortestWord();
        String result = ShortestWord.shortestWord(sentence);
        assertEquals(expected,result);

    }

}

