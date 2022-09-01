package home_work_1;


import java.util.Scanner;

public class MathClass2 {
    public static void main(String[] args) {
        //Пользователь вводит через консоль радиус круга;
        //Найти чему равна  площадь круга

        Scanner console3 = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        int radius = console3.nextInt();
        long area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.printf("Площадь круга с радиусом- "+radius+ " равна- "+area);




    }
}
