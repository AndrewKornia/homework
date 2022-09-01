package home_work_2.arrays;

import home_work_2.sort.SortsUtils;
import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysRandom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите предпочитаему длиннну масивва ");
        int size = console.nextInt();
        System.out.println(" До какого числа генерировать рандомные числа. ");
        int maxValueExclusion = console.nextInt();
         int[] container = ArraysUtils.arrayRandom(size,maxValueExclusion);





    }
}
