import java.util.Stack;

public class Solution {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char prechar = str.charAt(i);
            if(prechar=='{'||prechar=='('||prechar=='[')
                stack.push(prechar);
            else if(prechar=='}' || prechar==']' || prechar==')')
                if(stack.isEmpty())
                    return false;
                else{
                    char cuchar = stack.pop();
                    if(prechar=='}' && cuchar=='{'||prechar==')' && cuchar=='('||prechar==']' && cuchar=='[')
                        continue;
                    else
                        return false;
                }
        }
        return stack.isEmpty();
    }
}
