package home_work_1;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        int visokosni = year%4;
        int visokosni1 = year%100;
        int visokosni2 = year%400;
        if (visokosni==0 & visokosni1==0 & visokosni2==0 ) {
            System.out.println("Год високосный "+year);
        }else {
            System.out.println("Год не високосный "+year);
        }

    }
}
