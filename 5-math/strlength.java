import java.lang.reflect.Array;


import java.util.*;
public class strlength {
    public static void main(String[] args) {
        String s1;
        String[] str;
        int i,count=1;
        s1 = "1234212qweqw wqweqw sdjk sdjk 1234212qweqw 1234212qweqw 1234212qweqw.";
        str = s1.split("[ .]");
        Arrays.sort(str);
        for ( i = 0; i < str.length - 1; i++) {
            if (str[i].equals(str[i + 1])) {
                count++;
            } else {
                System.out.println(str[i]+"\t"+count);
                count = 1;
            }
        }
        System.out.println(str[i]+"\t"+count);
    }
}
