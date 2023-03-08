import java.util.*;
public class moreIf {
    public static void main(String[] args) {
        double x, y, result;
        char symbol = 's';
        Scanner reader = new Scanner(System.in);
        x = reader.nextDouble();
        symbol = reader.next().charAt(0);
        y = reader.nextDouble();
        if (symbol=='+')
            result = x + y;
        else if (symbol=='-')
            result = x - y;
        else if(symbol=='*')
            result = x * y;
        else
            result = x / y;

        System.out.println("result"+result);
    }
}
