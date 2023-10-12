import java.util.Scanner;

public class array_01 {
    public static void main(String[] args) {
        int[] a;
        double ave = 0;
        a = new int[10];
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = reader.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            ave = ave + a[i];
        }
        ave = ave / 10;
        System.out.println("平均数是：" + ave);
    }
}
