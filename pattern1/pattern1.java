//pattern - 1

// *
// * *
// * * * 
// * * * * 
// * * * * *

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= n; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        int row = 1, nst = 1;
        while (row <= n) {
            for (int i = 1; i <= nst; i++) {
                System.out.print("*	");
            }
            System.out.println();
            row++;
            nst++;
        }

    }
}