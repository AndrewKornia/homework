package home_work_2.sort;

public class SortsUtils {

    public static int[] bubble(int[] arr){
        boolean sorted;
        do{
            sorted = true;
            for(int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int tmp =arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=tmp;
                    sorted = false;
                }
            }
        }while (!sorted);
        return arr;
    }

    public static void shake(int[] arr){

    }


}
