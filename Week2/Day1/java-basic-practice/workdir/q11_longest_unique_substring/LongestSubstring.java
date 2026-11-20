import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        // Map the character to its last index in the string
        /**
         * HashMap is a good choice here because it's efficient and let's me use the character as the 
         * index to its previously seen location
         */
        Map<Character, Integer> lastSeen = new HashMap<>();

        int best = 0; // counter for the longest length seen yet
        int left = 0; // For my scanning; how I keep track of the left index

        /**
         * Sliding window never has duplicate characters. 
         * As we explore the string, we increase the size of our window.
         * 
         * If the character at the right pointer is not unique to the window, 
         * then we need to increment the left pointer up to just past the first occurence of the 
         * duplicate character (since its duplicate could be in the middle of the window. )
         */

        for (int right = 0; right < s.length(); right++) {
            // Discover the next character
            char c = s.charAt(right);

            // Check if this is a duplicate character (fetching value; actual check is in if statement)
            Integer prev = lastSeen.get(c);

            // Checking that prev is still inside the window.
            if (prev != null && prev >= left) {
                left = prev + 1;
            }

            // Update the last seen value for this character
            lastSeen.put(c, right);

            // keep the best counter up to date / check if current window is larger than the best we've seen yet
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
    }
}
