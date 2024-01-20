package JAVA.Basics;
import java.util.Scanner;

public class PosorNeg {
    public static String positiveOrNegative(int number) {
        //Write your code here
        if(number<0)
            return "Negative";
        else 
            return "Positive";
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            System.out.println(positiveOrNegative(b));
        }
    }
}
