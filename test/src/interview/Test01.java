package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int ans = 0;
        int index = 0;
        while (index < list.size()) {
            int sum = 0;
            int i = index;
            int temp = list.get(i);
            if(index==n-1){
                ans++;
                break;
            }
            sum = temp + list.get(++i);
            if (temp >= m) {
                ans++;
                index++;
            } else {
                while (sum > m && i < n) {
                    sum = list.get(i) + temp;
                    i++;
                }
                if (i < n) {
                    ans++;
                    index++;
                    list.remove(i);
                } else {
                    ans++;
                    index++;
                }
            }
        }
        System.out.println(ans);

    }
}
