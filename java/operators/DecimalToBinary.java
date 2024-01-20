package JAVA.Operators;
import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int decimalNumber = sc.nextInt();
        String binaryNumber = "";
		if(decimalNumber==0){
			System.out.println(0);
		}
		else{while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }}
        

        System.out.println(binaryNumber);
    }
	}

