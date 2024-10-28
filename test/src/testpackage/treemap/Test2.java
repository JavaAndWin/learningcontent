package testpackage.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";

        TreeMap<String,Integer> tm = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            if (tm.containsKey(s)) {

                //存在字符
                int count = tm.get(s) + 1;
                tm.put(s, count);
            } else {

                //不存在字符
                tm.put(s, 1);
            }
        }

        StringBuilder result = new StringBuilder();
        Set<Map.Entry<String, Integer>> entries = tm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            result.append(entry.getKey()).append("(").append(entry.getValue()).append(")");
        }
        System.out.println(result);
    }
}
