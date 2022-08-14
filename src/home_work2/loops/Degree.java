package home_work2.loops;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число ");
        int num = console.nextInt();
        System.out.println("Введите степень чилса");
        int numStepen = console.nextInt();
        System.out.print(num+"*");
        int num1= 1;
        for (int i=0;i<numStepen ; i++){
            num1*=num;
        }
        System.out.println();
    }
}
