package home_work2.arrays;

import home_work2.utils.ArraysUtils;

import java.util.Scanner;


public class ArraysFromConsole {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        System.out.println("Введие размер массива");
        int number = console.nextInt();
        int[]container = ArraysUtils.arrayFromConsole(number);


    }
}
