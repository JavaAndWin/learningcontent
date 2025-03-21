package learning.arrayList;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone("小米", 1000));
        list.add(new Phone("苹果", 8000));
        list.add(new Phone("锤子", 2999));

        low3000(list);
    }

    public static void low3000(ArrayList<Phone> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                System.out.print(list.get(i).getBrand() + ",");
            }
        }
    }
}
