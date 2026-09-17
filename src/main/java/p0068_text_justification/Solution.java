package p0068_text_justification;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/text-justification/">68. Text Justification</a>
 * <br><br>
 * Difficulty: Hard
 */
public class Solution {

    public List<String> fullJustify(String[] words, int maxWidth) {
        int n = words.length;
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int lineWidth = 0;
            int spaces = maxWidth;
            List<String> line = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            boolean bLast = false;

            while (lineWidth + words[i].length() + (!line.isEmpty() ? 1 : 0) <= maxWidth) {
                line.add(words[i]);
                lineWidth += words[i].length() + (line.size() > 1 ? 1 : 0);
                spaces -= words[i].length();
                i++;
                if (i == n) {
                    bLast = true;
                    break;
                }
            }

            if (bLast || line.size() == 1) {
                for (String w : line) {
                    sb.append(w);
                    sb.append(' ');
                }

                if (sb.length() > maxWidth) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    while (sb.length() < maxWidth) {
                        sb.append(' ');
                    }
                }
            } else {
                int leftSpacing = Math.ceilDiv(spaces, line.size() - 1);
                int rightSpacing = leftSpacing - 1;
                int leftSpacingCount = line.size() - 1;
                int rightSpacingCount = 0;

                int spaces_copy = spaces;
                while (spaces_copy % leftSpacing != 0 || leftSpacing * leftSpacingCount + rightSpacing * rightSpacingCount > spaces) {
                    rightSpacingCount++;
                    leftSpacingCount--;
                    spaces_copy -= rightSpacing;
                }

                for (String w : line) {
                    sb.append(w);
                    if (leftSpacingCount > 0) {
                        sb.repeat(' ', leftSpacing);
                        leftSpacingCount--;
                    } else if (rightSpacingCount > 0) {
                        sb.repeat(' ', rightSpacing);
                        rightSpacingCount--;
                    }
                }

            }

            result.add(sb.toString());
        }

        return result;
    }
}