public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        if(str.length()<=1)
            return true;
        else{
            if(str.charAt(0)==str.charAt(str.length()-1))
                return isPalindrome(str.substring(1,str.length()-1));
            else
                return false;
        }
    }
}
