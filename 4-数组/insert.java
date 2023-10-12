import java.util.*;
public class insert {
    public static void main(String[] args) {
        int input;
        int[] a;
        int n = 5,i;
        a = new int[5];
        Scanner reader = new Scanner(System.in);
        for ( i = 0; i < n; i++) {
            a[i] = reader.nextInt();
        }
        System.out.println("请输入要插入的数：");
        input = reader.nextInt();
        for (i = n - 1; i < a.length; i--) {
            if (a[i] > input) {
                a[i + 1] = a[i];
            } else {
                a[i + 1] = input;
                break;
            }
        }
        if (i < 0) {
            a[0] = input;
        }
        n++;
        for (i = 0; i < n; i++) {
            System.out.print(a[i]+"\t");
        }
    }
}
