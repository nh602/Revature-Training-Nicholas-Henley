public class FirstNonRepeated {

    /** @return the first non-repeated char, or null if none */
    public static Character firstNonRepeated(String s) {
        for(int i = 0; i < s.length(); i++){
            // When checking in order, if last index is same as the first index of the letter then it's unique.
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return s.charAt(i);
        }
        return null;
    }

    public static void main(String[] args) {
        firstNonRepeated("Hello");
    }
}
