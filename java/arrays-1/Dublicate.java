
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int n = arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){

                }
                else{
                    if(arr[i]==arr[j]){
                        temp=arr[i];
                    }
                }
            }
        }
        return temp;
    }
}