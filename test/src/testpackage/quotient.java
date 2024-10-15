package testpackage;

public class quotient {
    public static void main(String[] args){
        int xx = 10 ,b = 9;
        int count = 0;
        while(xx >= b){
            xx = xx - b;
            count++;
        }
        System.out.println("商等于" + count + "余数等于" + xx);
    }
}
