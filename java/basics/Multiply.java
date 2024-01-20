package JAVA.Basics;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        int f1, f2;
        Scanner s = new Scanner(System.in);
        
        f1 = s.nextInt();
        f2 = s.nextInt();
        
        long ans = (long) f1 * f2;
        System.out.println(ans);
    }
}
