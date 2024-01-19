public class Solution {

    public static String reverseEachWord(String str) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                end = i - 1;
                for (int j = end; j >= start; j--) {
                    sb.append(str.charAt(j));
                }
                sb.append(" ");
                start = end + 2;
            }
        }
        for (int j = str.length() - 1; j >= start; j--) {
            sb.append(str.charAt(j));
        }
        return sb.toString();
    }


}
