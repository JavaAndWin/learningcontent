package testpackage;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("A,b,c");
        String s2 = "a,b,c";
        //比较字符串
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //遍历字符串，得到字符数组
        /*char[] chars = getchar(s1);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }*/

        int[] arr = {1, 2, 3, 4};
        System.out.println(itos(arr));

        //返回反转字符串
        System.out.println(reverseStr(itos(arr)));
    }

    //遍历字符串，返回字符数组
    public static char[] getchar(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    //将int数组拼接成字符串并返回
    public static String itos(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
//            等同于下面的判断语句
//            str = i == arr.length - 1 ? str + arr[i] + "]" : str + arr[i] + ",";
            if (i < arr.length - 1) {
                str = str + arr[i] + ",";
            } else {
                str = str + arr[i] + "]";
            }
        }
        return str;
    }

    //将输入的字符串反转返回
    public static String reverseStr(String str1) {
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            str2 = str2 + str1.charAt(str1.length() - 1 - i);
        }
        return str2;
    }
}
