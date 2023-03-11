import java.util.Scanner;

public class addResult {
    public static void main(String[] args) {
        double x, sum = 0, average;
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            x = reader.nextDouble();
            sum += x;

        }
        average = sum / 10;
        System.out.println("sum:"+sum+"average"+average);
    }
}
