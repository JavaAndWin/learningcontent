package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(new User("001", "张三", "1234"));
        list.add(new User("002", "李四", "2222"));
        list.add(new User("003", "王五", "3333"));

        System.out.println(seekUser(list, sc.next()));
    }

    public static boolean seekUser(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
