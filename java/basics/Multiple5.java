package JAVA.Basics;
import java.util.Scanner;

public class Multiple5 {
	public static void multipleOf5(int n) {
        // Write your code here
		if(n%5==0)
            System.out.println("Multiple of 5");
        else
            System.out.println("Not a Multiple of 5");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int n=sc.nextInt();
            multipleOf5(n);
        }
    }
}