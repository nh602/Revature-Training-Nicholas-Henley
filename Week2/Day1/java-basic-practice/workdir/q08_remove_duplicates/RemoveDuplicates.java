public class RemoveDuplicates {

    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char c: s.toCharArray()){
            // If the character isn't in sb then append it
            if(sb.indexOf("" + c) < 0) sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] inputs = {"programming", "mississippi", "aaaa", "abc", "a b a b"};
        for (String s : inputs) {
            System.out.println("\"" + s + "\" -> \"" + removeDuplicates(s) + "\"");
        }
    }
}
