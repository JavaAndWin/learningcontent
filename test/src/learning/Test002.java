package learning;

import java.util.*;

public class Test002 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Staff1");
        list.add("Staff2");
        list.add("Staff3");

        List<List<String>> result = new ArrayList<>();
        for (int i = 1; i <= 3; i++) { // 组合大小从 1 到 3
            generateCombinations(list, new ArrayList<>(), 0, i, result);
        }

        // 输出所有组合
        for (List<String> combination : result) {
            System.out.println(combination);
        }
    }

    private static void generateCombinations(List<String> list, List<String> temp, int start, int size, List<List<String>> result) {
        if (temp.size() == size) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < list.size(); i++) {
            temp.add(list.get(i));
            generateCombinations(list, temp, i + 1, size, result);
            temp.remove(temp.size() - 1); // 回溯
        }
    }
}
