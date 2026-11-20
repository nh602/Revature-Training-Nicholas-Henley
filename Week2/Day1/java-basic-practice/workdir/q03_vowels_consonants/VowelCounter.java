public class VowelCounter {

    /** @return an array {vowels, consonants} */
    public static int[] count(String s) {
        // v, c
        int[] out = {0, 0}; // starting values

        // iterate through lowercase trim'd character array
        for (char c: s.trim().toLowerCase().toCharArray()){
            // Don't count the numbers or punctuation or whitespace or anything like that.
            if (c > 122 || c < 97) continue;

            // detects if c is in the string of vowels via indexOf (-1 if not found)
            if ("aeiou".indexOf(c) >= 0) {
                out[0]++;
            } else {
                out[1]++;
            }
        }

        return out;
    }

    public static void main(String[] args) {
        int[] counts = count("testing this out"); // should be 5 / 9
        System.out.printf("Vowels: %d, Consonants: %d\n", counts[0],  counts[1]);
    }
}
