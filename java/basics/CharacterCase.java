import java.util.*;
public class CharacterCase {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int b=(int)a;
        if(b<=90&&b>=65)
            System.out.println(1);
        else if(b<=122&&b>=97)
            System.out.println(0);
        else    
            System.out.println(-1);
    }
}