public class Anagram {

    public static boolean isAnagram(String a, String b) {

        // Strip whitespace and convert to lowercase
        String astr = a.toLowerCase().replaceAll("\\s+", "");
        String bstr = b.toLowerCase().replaceAll("\\s+", "");

        // Length check - auto fail
        if (astr.length() != bstr.length()) return false;
        
        // Loop through each character in a
        for (char c: astr.toCharArray()){
            int ind = bstr.indexOf(c); // find index of character 'a' in str b
            
            // Was it found in b?
            if (ind >= 0) {
                // Remove that character from b to avoid double counting
                bstr = bstr.substring(0, ind) + bstr.substring(ind + 1);
            } else {
                // if not found not anagram
                return false;
            }
        }

        // anagram if made it to here
        return true;
    }

    public static void main(String[] args) {

        String[][] cases = {
            {"listen", "silent"},
            {"Dormitory", "Dirty Room"},
            {"The eyes", "They see"},
            {"hello", "world"},
            {"abc", "abcd"},
            {"aab", "abb"},
            {"Astronomer", "Moon starer"},
            {"Conversation", "Voices rant on"},
            {"rat", "car"},
            {"a", "a"},
            {"", ""}
        };

        for (String[] c : cases) {
            report(c[0], c[1]);
        }
    }

    private static void report(String a, String b) {
        System.out.printf("\"%s\" and \"%s\" -> %s%n",
                a, b, isAnagram(a, b) ? "anagrams" : "NOT anagrams");
    }
}
