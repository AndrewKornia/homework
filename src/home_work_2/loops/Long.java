package home_work_2.loops;

import java.util.Scanner;

public class Long {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число на которое желаите умножить ");
        int mnojitel = console.nextInt();
        long number = 1L;
        long maxL = (9223372036854775807L / mnojitel)-1;
        long result = maxLong(number, maxL, mnojitel);
        System.out.println("Значение до переполнения"+result);
        System.out.println("Значение после переполнения"+result*mnojitel);
    }

    public static long maxLong(long a, long b, int z) {
        for (int i = 1; i <9223372036854775807L; i++) {
            if (!(a > b)||b<0) {
                a = a * z;
            }else {
                return  a;
            }
        }
        return a;
    }

}
