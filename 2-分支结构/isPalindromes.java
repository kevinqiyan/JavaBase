import java.util.Scanner;

public class isPalindromes {
    public static void main(String[] args) {
        int n,t, s = 0;
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        t = n;
        while (n != 0) {
            s = s * 10 + n % 10;
            n = n / 10;
        }
        if (s == t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
            
        }
    }
}
