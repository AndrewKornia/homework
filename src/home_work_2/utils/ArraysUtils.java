package home_work_2.utils;

import java.util.Scanner;


public class ArraysUtils {


    public static int[] arrayFromConsole(int a) {
        Scanner console = new Scanner(System.in);
        int[] arrays = new int[a];
        for (int i = 0; i <a; i++) {
            System.out.println("Введите число для " + i + " елемента массива");
            int elemet = console.nextInt();
            arrays[i] = elemet;
        }
        return arrays;

    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int [] randomArrays = new int[size];
        for (int i = 0; i < size; i++) {
            randomArrays[i] =(int) (Math.random()*maxValueExclusion);
        }
        return randomArrays;
    }

}
