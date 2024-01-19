import java.util.Scanner;

public class SimpleInterst {
    public static double calculateSimpleInterest(int p, int r, int t) {
        double P=p;
        double T=t;
        double R=r;
        double SI=P*T*R;
        double re = SI/100;
        return re;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int p=sc.nextInt();
            int t=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(calculateSimpleInterest(p, r, t));
        }
    }
}