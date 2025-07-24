package May24;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] arr=new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=i+1;
                System.out.println(arr[i][j]);
            }
        }
    }
}
