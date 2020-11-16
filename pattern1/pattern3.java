//           *
//         * * 
//       * * * 
//     * * * * 
//   * * * * * 
// * * * * * *   

//pattern 3
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int row = 1, nst = 1, nsp = n - 1;
        while (row <= n) {
            // code for each row
            // 1. print spaces
            for (int i = 1; i <= nsp; i++) {
                System.out.print("	");
            }

            // 2. print stars
            for (int i = 1; i <= nst; i++) {
                System.out.print("*	");
            }

            // next line
            System.out.println();

            // Preparation for next row
            nst++;
            nsp--;
            row++;
        }

    }
}