public class Solution {
    public static int[] merge(int arr1[], int arr2[]) {
        int a = arr1.length;
        int b = arr2.length;
        int[] arr3 = new int[a + b];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < a && j < b) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        while (i < a) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        
        while (j < b) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        
        return arr3;
    }
}
