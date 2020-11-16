// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// *

//pattern 2

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int row = 1, nst = n;
        while (row <= n) {
            // code for each row
            for (int i = 1; i <= nst; i++) {
                System.out.print("*	");
            }
            // new line
            System.out.println();

            // preparation for next row
            nst--;
            row++;
        }

    }
}