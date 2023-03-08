import java.util.*;
public class max {

    public static void main(String[] args) {
        int a, b;
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        if (a > 0) {
            b = a;
        } else {
            b = -a;
        }

        System.out.println("|"+a+"|="+b);
    }
}