public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		 for(int i=start;i<=end;i=i+step){
			 int c = ((i-32)*5)/9;
			 System.out.println(i+"\t"+c);
		 }
	}
}