import java.util.Scanner;

public class buy {
    public static void main(String[] args) {
        int a;
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 33; j++) {
                if (5*i+3*j+(a-i-j)/3 == a) {
                    System.out.println("公鸡:" +i+"母鸡:"+j);
                }
            }
        }
    }
}
