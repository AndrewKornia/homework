package home_work_1;

import java.util.Scanner;

public class MathClass3 {
    public static void main(String[] args) {
        //Возводим числ в степень
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число ");
        double number1 = console.nextLong();
        System.out.println("Введите степень числа ");
        double number2 = console.nextLong();
        double number = Math.pow(number1,number2);
        System.out.println("Степень числа "+ number1 + " в "+number2+"тепени = "+number);



    }
}
