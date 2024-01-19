public class Solution {
    public static String minLengthWord(String input) {
        String[] strarr = input.split(" "); // Use double quotes for the split delimiter
        int ch = -1;
        int small = Integer.MAX_VALUE; // Use Integer.MAX_VALUE for comparison
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].length() < small) { // Compare the length of strings
                small = strarr[i].length();
                ch = i;
            }
        }
        return strarr[ch];
    }
}
