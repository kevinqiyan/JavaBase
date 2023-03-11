
// 判断回文数
public class isPalindrome {
    public static void main(String[] args) {
        System.out.println("结果是什么："+isHuiWen(12321));
    }
    
    public static boolean isHuiWen(int target) {
        int temp = target;
        int j = 0;
        
        while (temp != 0) {
            j = j * 10 + temp % 10;
            temp = temp / 10;

        }
        if (j == target) {
            return true;
        } else {
            return false;
        }
    }
}
