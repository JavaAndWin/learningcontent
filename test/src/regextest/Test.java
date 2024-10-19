package regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "已学完，说一下自己的感悟：\n" +
                "1、教学重难点突出，板书条理清晰。教学1步骤设计合理，由浅入深，循序渐进。\n" +
                "2、教师基本功扎实，知识讲解准确，教学12设计合理，始终以学生为主体，自主学习，小组交流讨论，上台交流展示等形式，师生配合默契，取得了较好的学习效果。\n" +
                "3、教师教态自然，语调亲切，并不断鼓励学生，充分发挥学生的主体作用。使学生在和谐融洽的课堂氛围中学习，推进了知识的掌握和智力的发展，达到了良好的教学效果。\n" +
                "4、教师准确的把握了设疑的方向，调动了学生学习的兴趣，使学生进入积极的的思维状态。\n" +
                "5、教师组织课堂教学效果好，语言清晰，能注重学法指导，培养学生的创新能力，问题设计富有启发性。\n" +
                "6、教学2环节设计安排清晰明了，过渡自然。";

        String regex = "教学\\d+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }


}
