import java.util.*;
public class nubWidth {
    public static void main(String[] args) {
        int count = 0, a;
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        if (a == 0)
            count = 1;
        while (a != 0) {
            a = a / 10;
            count = count + 1;
        }
        System.out.println("输入的长度是什么:"+count);
    }
}
