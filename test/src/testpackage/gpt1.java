package testpackage;

public class gpt1 {
    public static boolean isPalindrome(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) return false;
        int reversed = 0;
        while (number > reversed) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return number == reversed || number == reversed / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));  // 输出 true
        System.out.println(isPalindrome(3456543));  // 输出 false
    }
}
