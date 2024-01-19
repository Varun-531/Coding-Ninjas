import java.util.*;

public class ReverseCharPattern {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int rows = n;
        while (rows > 0) {
            int col = n - rows + 1;
            int number = n;
            while (col > 0) {
                char c = (char) (number - 1 + 'A');
                System.out.print(c);
                number--;
                col--;
            }
            System.out.println("");
            rows--;
        }
    }
}