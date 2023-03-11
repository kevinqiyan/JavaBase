import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int a, sign = 1;
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        for (int i = 0; i < a; i++) {
            if (a % i == 0) {
                sign = 0;
                break;
            }
        }
        if (sign == 1) {
            System.out.println("a是质数");
        } else {
            System.out.println("a不是指数");
        }
    }
}
