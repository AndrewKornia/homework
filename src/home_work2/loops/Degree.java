package home_work2.loops;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число ");
        double num = console.nextDouble();
        System.out.println("Введите степень чилса");
        int numStepen = console.nextInt();
        double numResult= 1;
        for (int i=0;i<numStepen ; i++){
            numResult*=num;
        }
        System.out.println(num +"^"+ numStepen+"="+numResult);
    }
}


