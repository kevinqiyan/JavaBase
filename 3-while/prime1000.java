public class prime1000 {
    public static void main(String[] args) {
        int j;
        for (int i = 2; i < 1000; i++) {
            for (j = 2; j < i; j++) {
                if (i%j == 0) {
                    break;
                }
            }
            if (j==i) {
                System.out.print(i+" ");
            }
        }
    }
}
