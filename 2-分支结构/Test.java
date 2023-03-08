import java.util.*;
public class Test {
    public static void main(String[] args) {
        int a, b;
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        b = reader.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
