package Practice_Qtns;

public class CodeSignal_StringPatternMatching {

    public static void main(String[] args) {
        String pattern = "amazing";
        String source = "010";
        
        int count = 0;

        // Loop through the pattern to find substrings of length equal to source
        for (int i = 0; i <= pattern.length() - source.length(); i++) {
            int j = 0;
            // Compare each character in the source to the corresponding character in the pattern
            while (j < source.length()) {
                if (source.charAt(j) == '0' && isVowel(pattern.charAt(i + j))) {
                    j++;
                } else if (source.charAt(j) == '1' && !isVowel(pattern.charAt(i + j))) {
                    j++;
                } else {
                    break;  // If it doesn't match, break the loop
                }
            }

            // If the entire source matches, increment the count
            if (j == source.length()) {
                count++;
            }
        }

        System.out.println(count);
    }

    // Function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
