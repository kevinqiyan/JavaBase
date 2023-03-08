import java.util.*;
/**
 * montday
 */
public class montday {

    public static void main(String[] args) {
        int a;
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();

        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("有 31 天的月份");
                break;
            case 2:
                System.out.println("有 28 天的月份");
                break;
            case 4:
            case 6:
            case 9:
                System.out.println("有 30 天的月份");
                break;
            default:
                System.out.println("无数据");
        }
    }
}