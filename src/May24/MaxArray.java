package May24;

public class MaxArray {
    public static void main(String[] args) {


        int[] arr = {12, 23, 43, 12, 65, 89, 342, 544,242,242424,24,2424,323212};

        int temp=0;
        int minTemp=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(temp<arr[i]){
                temp=arr[i];
            }
            else{
                temp=temp;
            }
        }
        System.out.println("Max Value is : "+temp);
        for (int i = 0; i < arr.length; i++) {
            if(minTemp>arr[i]){
                minTemp=arr[i];
            }
            else{
                minTemp=minTemp;
            }

        }
        System.out.println("Min Value is : "+minTemp);

    }

}
