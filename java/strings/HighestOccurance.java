public class Solution {

    public static char highestOccuringChar(String str) {
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int asc = (int) str.charAt(i);
            arr[asc] += 1;
        }
        char cc = ' ';
        int hnum = 0;
        for (int j = 0; j < str.length(); j++) {
            if (hnum < arr[str.charAt(j)]) {
                hnum = arr[str.charAt(j)];
                cc = str.charAt(j);
            }
        }
        return cc;
    }

}
