package home_work_2.arrays;

public class ArraysIteration2 {


    public static int[] foR(int[]containre){
        for (int i =1;i<containre.length;i++){
            System.out.println(containre[i]);
        }
        return containre;
    }



    public static int[] everySecond(int[]container){
        for (int i =0;i<container.length;i+=2){
            System.out.println(container[i]);
        }
        return container;
    }
    public static int[] arrayReverse(int[]container){ // МНе кажется код так себе но он работает
        int save =0;
        for (int i =0;i<container.length/2;i++){
            save =container[i];
            container[i]=container[container.length-i-1];
            container[container.length-i-1]=save;
        }
        return container;
    }




}

