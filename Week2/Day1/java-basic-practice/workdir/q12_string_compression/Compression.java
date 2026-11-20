public class Compression {

    public static String compress(String s) {
        // Insta return if empty str
        if(s.length() < 1) return "";

        StringBuilder sb = new StringBuilder();

        // Sliding window left index and count for current character
        int left = 0;
        int count = 1;

        // loop over the rest of the str (start at 1 bc left index points to 0 / compared on first pass)
        for (int i = 1; i <= s.length(); i++) {
            // Keep incrementing the count until we find a different character
            if (i < s.length() && s.charAt(left) == s.charAt(i)) { // Due to length check, final iteration skips count++ and just pushes the in flight data to sb.
                count++;
                continue; // short circuit this loop iteration if same character
            }

            // Append the character at the left index and its count
            sb.append(s.charAt(left)).append(count);
            // update left index / reset count for new character
            left = i;
            count = 1;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO
    }
}
