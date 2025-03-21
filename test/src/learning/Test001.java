package learning;

public class Test001 {
    public static void main(String[] args) {
        String[] strs1 = {"chien", "chat", "cheval"};
        String[] strs2 = {"dogch","catcch","horsechch"};
        String ans1 = getStartWith(strs1);
        String ans2 = getStartWith(strs2);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    public static String getStartWith(String[] strs){
        String ans = "";
        for(int i = 0; i < strs[0].length(); i++){
            String str =strs[0];
            String s = str.substring(str.length()-i-1,str.length());
            for(int j =0;j<strs.length;j++){
                if(!strs[j].endsWith(s)){
                        return ans;
                }
            }
            ans = s;
        }

        return ans;

    }
}
