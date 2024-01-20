package JAVA.Basics;
import java.util.*;
public class Ascii {
    public static int calculateASCII(char ch){
        int i = ch;
        return i;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        System.out.println(calculateASCII(a));
    }
}