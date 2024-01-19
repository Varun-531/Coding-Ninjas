public class Solution {
    public static int findUnique(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean foundUnique = false;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1) {
                temp = arr[i];
                foundUnique = true;
                break;
            }
        }
        // if (!foundUnique) {
        //     System.out.println("No unique element found");
        // }
        
        return temp;
    }
}
