package learning.testpackage;

import java.util.StringJoiner;

public class Sb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aaa").append("bbb").append("ccc").reverse();
        System.out.println(sb);
        StringJoiner sj = new StringJoiner(",", "[", "]");
        System.out.println(sj.add("aaa").add("bbb").add("ccc"));
    }
}
