public class Solution {
    public static int search(int []nums, int target) {
        //Your code goes here
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }

}