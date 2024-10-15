package testpackage;

public class Arr2D {
    public static void main(String[] args) {
        //静态二维数组
        /*int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                System.out.print(arr[i][i1] +" ");
            }
            System.out.println();
        }*/

        //动态二维数组
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                System.out.print(arr[i][i1] + " ");
            }
            System.out.println();
        }
    }
}
