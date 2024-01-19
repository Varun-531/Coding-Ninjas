import java.util.*;
public class Remark {
    public static void remarkStudent(int score) {
        if(score<=100&&score>=75)
            System.out.println("Distinction");
        else if(score<=75&&score>=50)
            System.out.println("Average");
        else
            System.out.println("Below Average");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            remarkStudent(b);
        }
    }
}