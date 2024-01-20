package JAVA.Strings;
public class Solution {
    public static String getCompressedString(String str) {
        int num = 0;
        String s = "";
        while (num < str.length() - 1) {
            int count = 1;
            while (num < str.length() - 1 && str.charAt(num) == str.charAt(num + 1)) {
                count++;
                num++;
            }
            if (count == 1) {
                s = s + str.charAt(num);
            } else {
                s = s + str.charAt(num) + count;
            }
            num++;
        }
        if (num < str.length()) {
            s = s + str.charAt(num);
        }
        return s;
    }


}
