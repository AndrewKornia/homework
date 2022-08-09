package home_work1;

import java.util.Scanner;

public class oddNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        long number = console.nextLong();
        long ostatok = number % 2;
        if (ostatok==0){
            System.out.println("Число "+number+" четное");
        }else {
            System.out.println("Число "+number+" не четное");
        }
    }
}
