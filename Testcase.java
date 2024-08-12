package project1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testcase {

    @Test
    public void testCountWordsInSimpleText() {
        WordCounter wordCounter = new WordCounter();
        wordCounter.countWords("hello world hello");
        String result = wordCounter.getWordCounts();

        assertTrue(result.contains("hello: 2"));
        assertTrue(result.contains("world: 1"));
    }

    @Test
    public void testCountWordsWithVaryingCases() {
        WordCounter wordCounter = new WordCounter();
        wordCounter.countWords("Hello hello HeLLo WORLD world");
        String result = wordCounter.getWordCounts();

        assertTrue(result.contains("hello: 3"));
        assertTrue(result.contains("world: 2"));
    }

    @Test
    public void testWithEmptyText() {
        WordCounter wordCounter = new WordCounter();
        wordCounter.countWords("");
        String result = wordCounter.getWordCounts();

        assertEquals("", result);
    }
}
