package p0068_text_justification;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;

        List<String> result = solution.fullJustify(words, maxWidth);

        assertThat(result).containsExactly("This    is    an", "example  of text", "justification.  ");
    }

    @Test
    void test2() {
        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth = 16;

        List<String> result = solution.fullJustify(words, maxWidth);

        assertThat(result).containsExactly("What   must   be", "acknowledgment  ", "shall be        ");
    }

    @Test
    void test3() {
        String[] words = {"ask", "not", "what", "your", "country", "can", "do", "for", "you", "ask", "what", "you", "can", "do", "for", "your", "country"};
        int maxWidth = 16;

        List<String> result = solution.fullJustify(words, maxWidth);

        assertThat(result).containsExactly("ask   not   what", "your country can", "do  for  you ask", "what  you can do", "for your country");
    }

    @Test
    void test4() {
        String[] words = {"Listen", "to", "many,", "speak", "to", "a", "few."};
        int maxWidth = 6;

        List<String> result = solution.fullJustify(words, maxWidth);

        assertThat(result).containsExactly("Listen", "to    ", "many, ", "speak ", "to   a", "few.  ");
    }

    @Test
    void test5() {
        String[] words = {"Imagination", "is", "more", "important", "than", "knowledge."};
        int maxWidth = 14;

        List<String> result = solution.fullJustify(words, maxWidth);

        assertThat(result).containsExactly("Imagination is", "more important", "than          ", "knowledge.    ");
    }

    @Test
    void test6() {
        String[] words = {"Do", "all", "the", "good", "you", "can,", "By", "all", "the", "means", "you", "can,", "In", "all", "the", "ways", "you", "can,", "In", "all", "the", "places", "you", "can,", "At", "all", "the", "times", "you", "can,", "To", "all", "the", "people", "you", "can,", "As", "long", "as", "ever", "you", "can."};
        int maxWidth = 26;

        List<String> result = solution.fullJustify(words, maxWidth);

        assertThat(result).containsExactly("Do  all  the good you can,", "By  all the means you can,", "In  all  the ways you can,", "In all the places you can,", "At  all the times you can,", "To all the people you can,", "As long as ever you can.  ");
    }
}