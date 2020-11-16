//  *	*	*	*	*	
// 	    *   *   *	*	
// 		    *   *   *	
// 			    *   *	
// 				    *

//4th pattern
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nrow = n, row = 1, nst = n, nsp = 0;

        while (row <= nrow) {
            for (int i = 1; i <= nsp; i++) {
                System.out.print("	");
            }
            for (int i = 1; i <= nst; i++) {
                System.out.print("*	");
            }

            System.out.println();

            nsp++;
            nst--;
            row++;
        }

    }
}