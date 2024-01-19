public class Solution {
    public static boolean checkSequence(String a, String b) {
        int a1 = 0;
        int b1 = 0;
        
        while (a1 < a.length() && b1 < b.length()) {
            if (a.charAt(a1) == b.charAt(b1)) {
				b1++;
            }
            a1++;
        }
        
        return b1 == b.length();
    }
}
