public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int zero = 0;
        int ones = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zero++;
            else   
                ones++;
        }
        for(int j=0;j<arr.length;j++){
            if(zero!=0){
                arr[j]=0;
                zero--;
            }
                
            else
                arr[j]=1;
        }
    }
}