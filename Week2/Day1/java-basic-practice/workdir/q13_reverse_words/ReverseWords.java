public class ReverseWords {

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = -1; // last char of the current word, or -1 if not inside a word

        // begin scanning right to left
        for (int i = s.length() - 1; i >= -1; i--) {
            // true when character under i is part of a space (not word)
            boolean isSpace = i < 0 || s.charAt(i) == ' ';

            if (!isSpace) {
                // When end is -1 and isSpace = false we're going from (space at i + 1) > (word at i)
                if (end == -1) end = i; // set end to the right edge of the word
                continue; // short circuit loop
            }

            // at this point, space is true.

            if (end != -1) { // a space just ended a word
                if (sb.length() > 0) sb.append(' ');
                sb.append(s, i + 1, end + 1); // append the word we just finished scanning
                end = -1; //reset end to -1 (meaning i is over a space)
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO
    }
}
