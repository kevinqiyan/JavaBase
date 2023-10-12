import java.util.*;

public class add {
    public static void main(String[] args) {
        int[] [] a;
        int i,j,n,sum = 0;
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        a = new int[n][n];
        for(i = 0; i<n; i++)
            for(j=0; j<n;j++)
                a[i][j] = reader.nextInt();
        for(i = 0;i<n;i++)
            sum = sum + a[i][n - 1 - i];
        System.out.println(sum);
    }
}
