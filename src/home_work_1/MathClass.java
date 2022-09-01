package home_work_1;

import java.lang.Math;
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        //Вводим чере командую строку 2 чисда;
        //Проверяем какое из них  больше относительно другого;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        long number1 = console.nextLong();
        System.out.println("Введите второе число");
        long number2 = console.nextLong();
        long maxNumber = Math.max(number1,number2);
        System.out.println("Чичло- "+maxNumber+", является наибольшим");

    }
}
