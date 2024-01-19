import java.util.*;

public class Alphabetic {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int row = 1;
        while (row <= n) {
            Character ch = 'A';
            int col = 1;
            while (col <= row) {
                System.out.print(ch + " ");
                col++;
                ch++;
            }
            System.out.println();
            row++;
        }
    }
}