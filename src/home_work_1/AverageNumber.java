package home_work_1;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int num1 = console.nextInt();
        System.out.println("Введите второе число ");
        int num2 = console.nextInt();
        System.out.println("Введите третье число ");
        int num3 = console.nextInt();
        int max = Math.max(Math.max(num1,num2),num3);
        int min = Math.min(Math.min(num1,num2),num3);
        int mid = num1+num2+num3 -(max+min);
        System.out.println("Среднее чисдо- "+ mid);
    }
}

