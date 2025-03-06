package testpackage.streamtest;


public class Test1 {
    public static void main(String[] args) {
        int ans = superpalindromesInRange("4","100");
        System.out.println(ans);


    }

    public static int superpalindromesInRange(String left, String right) {
        int m = Integer.valueOf(left);
        int n = Integer.valueOf(right);
        int count=0;
        for(int i =m;i<=n;i++){
            if(superpalind(i)){
                count++;
            }

        }
        return count;
    }

    public static boolean superpalind(int num){
        String str1 = String.valueOf(num);
        boolean r1 = reverse(str1);
        if(r1){
            double n = Math.pow(num,0.5);
            if(n==(int)n){
                String str2 = String.valueOf((int)n);
                return r1&&reverse(str2);
            }
        }
        return false;

    }

    public static boolean reverse(String str){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i =0;i<n;i++){
            sb.append(str.charAt(n-i-1));
        }
//        System.out.println(str+" "+sb.toString());
        if(sb.toString().equals(str)){
            return true;
        }
        return false;
    }


}