import java.util.Scanner;

public class Descending {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int rows = n;

        for (; rows > 0; rows--) {
            int col = n - rows + 1;
            int number = n;

            for (; col > 0; col--) {
                System.out.print(number + " ");
                number--;
            }

            System.out.println("");
        }
    }
}
