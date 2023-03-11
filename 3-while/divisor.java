import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        int a;
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        for (int j = 1; j <= a; j++) {
            if (a % j == 0) {
                // 求余数
                System.out.println("YUSHUSHI:"+j+",");
            }
        }
    }
}
