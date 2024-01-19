import java.util.*;

public class Solution {
    public static boolean checkMember(int n) {
        int sum = 0;
        int a = 1;
        int b = 0;
        
        if (n == 1 || n == 0)
            return true;
        else {
            while (true) {
                sum = a + b;
                a = b;
                b = sum;
                if (sum == n)
                    return true;
                if (sum > n)
                    return false;
            }
        }
    }
}
