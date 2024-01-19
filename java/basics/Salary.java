import java.lang.*;
import java.util.*;
public class Salary {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s =  new Scanner(System.in);
		float n=s.nextFloat();
		String st = s.next();
		char ch = st.charAt(0);
		float hra = 20*n/100;
		float da = 50*n/100;
		float allow;
		if (ch=='A') {
			allow=1700.0f;
		}
		else if(ch=='B') {
			allow=1500.0f;
		}
		else {
			allow=1300.0f;
		}
		float pf=11*n/100;
		float sal=n+hra+da+allow-pf;
		int tot= Math.round(sal);
		System.out.println(tot);
	}
}
