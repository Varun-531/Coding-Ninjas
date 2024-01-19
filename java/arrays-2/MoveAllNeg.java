public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
        int n = a.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                int temp = a[i];
                a[i]=a[k];
                a[k]=temp;
                k++;
            }
        }
        return a;
    }
}