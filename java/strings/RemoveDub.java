package JAVA.Strings;
public class Solution {

    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int[] freq = new int[256]; // Assuming extended ASCII characters (256 possible characters)
        // Count the frequency of characters in str1 and decrement the frequency of characters in str2
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        // Check if all frequencies are zero
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
}
