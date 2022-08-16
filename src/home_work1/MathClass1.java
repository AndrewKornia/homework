package home_work1;


import java.util.Scanner;

public class MathClass1 {
    public static void main(String[] args) {
        //Пользователь вводит через консоль площадь квадрат;
        //Найти чему равна  сторона квадрата;
        System.out.println("Введите площать квадрата");
        Scanner console1 = new Scanner(System.in);
        double square = console1.nextDouble();
        double side = Math.sqrt(square);
        System.out.println("Сторона квадрата равна "+side);
    }
}
