public class stringTrue {
    public static void main(String[] args) {
        String s1, s2, s3, s4;
        s1 = "abc";
        s2 = "abc";
        s3 = new String("abc");
        s4 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3.equals(s2));
        System.out.println(s3 == s4);
    }
}
