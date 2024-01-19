
public class solution {
	static int count=0;
	public static int countZerosRec(int input){
		// Write your code here
		if(input==0)
			return count+1;
		else if(input<10 )
			return count;
		else{
			if(input%10==0)
				count++;
			return countZerosRec(input/10);
		}
	}
}
