import java.util.Scanner;

import java.util.*;
public class sqrt {

    public static void main(String[] args) {
        double a, b, c, m, s;
        Scanner reader = new Scanner(System.in);
        a = reader.nextDouble();
        b = reader.nextDouble();
        c = reader.nextDouble();
        if (a+b>c&&b+c>a&&a+c>b) {
            m = (a + b + c) / 2;
            s = Math.sqrt(m * (m - a) * (m - b) * (m - c));
            System.out.println("三角形面积为："+s);
        } else {
            System.out.println("不能组成三角形");
        }
    }
}
