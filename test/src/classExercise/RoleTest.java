package classExercise;

import java.util.Scanner;

public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰", 100);
        Role r2 = new Role("鸠摩智", 100);
        Scanner sc = new Scanner(System.in);
        int x;
        while (true) {
            x = sc.nextInt();
            r2.beAttacked(r1);
        }

    }
}
