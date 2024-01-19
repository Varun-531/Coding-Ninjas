
public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        int count1=0;
        int count2=0;
        int count0=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                count0++;
           else if(arr[i]==1)
                count1++;
            else
                count2++;
        }
        int j=0;
        while(j<count0){
            arr[j]=0;
            j++;
        }
        while(j-count0<count1){
            arr[j]=1;
            j++;
        }
        while(j-count0-count1<count2){
            arr[j]=2;
            j++;
        }
            
            
    }

}