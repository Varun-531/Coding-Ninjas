import java.util.* ;
import java.io.*; 

public class Gcd{
	public static int findGcd(int x, int y) {
	
       int result = Math.min(x, y);
	   while(result>0){
	   if(x%result==0&&y%result==0)
	   	break;
		else{
			result--;
		}}
		return result;
	}}
