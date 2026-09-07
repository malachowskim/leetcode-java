package p0127_word_ladder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(List.of("hot", "dot", "dog", "lot", "log", "cog"));

        int result = solution.ladderLength(beginWord, endWord, wordList);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void test2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(List.of("hot", "dot", "dog", "lot", "log"));

        int result = solution.ladderLength(beginWord, endWord, wordList);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void test3() {
        String beginWord = "qa";
        String endWord = "sq";
        List<String> wordList = new ArrayList<>(List.of("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"));

        int result = solution.ladderLength(beginWord, endWord, wordList);

        assertThat(result).isEqualTo(5);
    }
}