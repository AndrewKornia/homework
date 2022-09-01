package home_work_1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        System.out.println("ВВедите число  которое  будем делить ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.println("Введите число на которое будем делить");
        int number1 = console.nextInt();
        int result= number/number1;
        int result1= number%number1;
        if (result1==0){
            System.out.println("Число делится- "+result);
        }else {
            System.out.println("Число не делится");
        }

    }
}
