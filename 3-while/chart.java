/**
 * chart
 */
import java.util.*;
public class chart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, j;
        a = reader.nextInt();
        // 三角形左边直角
        // for (int i = 0; i <= a; i++) {
        //     for (int j = 0; j <= i - 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
        // 三角形右边直角
        for (int i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}