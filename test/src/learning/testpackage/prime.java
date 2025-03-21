package learning.testpackage;

public class prime {
    public static void main(String[] args) {
    prime();
    }

    public static void prime() {
        int num = 101;
        while(num < 200){

            for (int j = 2; j <= 100; j++) {
                int num1 = num % j;
                if (num1 == 0) break;
                if (j == 100) System.out.println(num);
            }
            num += 1;
        }
    }
}