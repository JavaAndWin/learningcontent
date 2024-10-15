package testpackage;

public class ConvertMoney {
    public static void main(String[] args) {
        char[] chars1 = {'零', '佰', '零', '拾', '零', '万', '零', '仟', '零', '佰', '零', '拾', '零', '元'};
        String str1 = "12345";
        String str2 = "零佰零拾贰万叁仟伍佰陆拾叁元";
        String result = "";
        int count = 1;
        //判断大小写
        if (judge(str2)) {
            for (int i = str1.length() - 1; i >= 0; i--) {
                chars1[chars1.length - count * 2] = sToBig(str1.charAt(i));
                count++;
            }
            result = new String(chars1);
        } else {
            int count2 = 0;
            for (int i = 0; i < str2.length(); i+=2) {
                if (str2.charAt(i) == '零' && count2 == 0) {

                } else {
                    result = result + bToSmall(str2.charAt(i));
                    count2++;
                }
            }

        }

        System.out.println(result);
    }

    //判断输入为大写金额还是小写
    public static boolean judge(String str) {
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return true;
        } else {
            return false;
        }
    }

    //小写转换为大写，大写转换为小写

    //匹配数字与大写数字
    public static char sToBig(char c1) {
        char c2;
        char[] chars = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        c2 = chars[Character.getNumericValue(c1)];
        /*switch(c1) {
            case 0 -> c2='零';
            case 1 -> c2='壹';
            case 2 -> c2='贰';
            case 3 -> c2='叁';
            case 4 -> c2='肆';
            case 5 -> c2='伍';
            case 6 -> c2='陆';
            case 7 -> c2='柒';
            case 8 -> c2='捌';
            case 9 -> c2='玖';
        }*/
        return c2;
    }
    public static char bToSmall(char c1) {
        char c2 = '1';
        switch(c1) {
            case '零' -> c2='0';
            case '壹' -> c2='1';
            case '贰' -> c2='2';
            case '叁' -> c2='3';
            case '肆' -> c2='4';
            case '伍' -> c2='5';
            case '陆' -> c2='6';
            case '柒' -> c2='7';
            case '捌' -> c2='8';
            case '玖' -> c2='9';
        }
        return c2;
    }

}


