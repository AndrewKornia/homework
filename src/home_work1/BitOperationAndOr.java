package home_work1;

import java.util.Scanner;

public class BitOperationAndOr {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Вводим данные через консоль:\n Введите первое целое число  ");
        long number3 = console.nextLong();
        System.out.println("ВВедите второе  целое число ");
        long number4= console.nextLong();
        long pobitOr = number3|number4;
        long pobitAnd = number3&number4;
        System.out.println("Результат побитового 'OR' "+"="+pobitOr);
        System.out.println(" Результат побитового 'AND' "+"="+pobitAnd);
    }
}

