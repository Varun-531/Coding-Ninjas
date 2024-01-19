public class Solution {

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            int arr1[] = new int[mid - l + 1];
            int arr2[] = new int[r - mid];

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr[l + i];
            }

            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = arr[mid + 1 + j];
            }

            mergeSort(arr1, 0, arr1.length - 1);
            mergeSort(arr2, 0, arr2.length - 1);
            merge(arr, arr1, arr2);
        }
    }

    public static void merge(int[] arr, int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }


}
