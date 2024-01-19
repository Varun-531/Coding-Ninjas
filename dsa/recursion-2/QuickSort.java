public class Solution {
    
    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        
        int pivotIndex = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivotIndex - 1);
        quickSort(input, pivotIndex + 1, endIndex);
    }
    
    public static int partition(int[] input, int si, int ei) {
        int pivot = input[si];
        int count = 0;
        for (int i = si + 1; i <= ei; i++) {
            if (input[i] < pivot) {
                count++;
            }
        }
        
        int temp = input[si + count];
        input[si + count] = pivot;
        input[si] = temp;
        
        int i = si;
        int j = ei;
        while (i < si + count && j > si + count) {
            if (input[i] < pivot) {
                i++;
            } else if (input[j] >= pivot) {
                j--;
            } else {
                int tempj = input[i];
                input[i] = input[j];
                input[j] = tempj;
                i++;
                j--;
            }
        }
        
        return si + count;
    }
    

}
