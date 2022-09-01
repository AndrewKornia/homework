package home_work_2.loops;

import java.util.Scanner;

public class FactorialRekursia {
    public static void main(String[] args) {
        Scanner fact = new Scanner(System.in);
        System.out.println("Введите цифру желательно до 20 , иначе комп начнет кричать");
        byte number = fact.nextByte();
        factotial(number);
        System.out.println(factotial(number));

    }
    public static long factotial(int a ){
        if(a==1) {
            return 1;
        }
        return a *factotial((byte)a -1);
    }

}

