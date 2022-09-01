package home_work_2.loops;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");

        if(console.hasNextInt()){
            System.out.println("Введено целое число");
            String result = "";
            long number = console.nextInt();
            long resultMult= 1;
            boolean star = false;
            while (number!=0){
                long digit = number % 10;
                if(star){
                    result = " * "+result;
                }else {
                    star = true;
                }
                result =digit + result;
                number /=10;
                resultMult*=digit;
            }
            System.out.println(result+ " = "+resultMult);


        }else if (console.hasNextDouble()){
            System.out.println("Введено не целое число");
        }else {
            System.out.println("Введена строка");
        }


    }
}

