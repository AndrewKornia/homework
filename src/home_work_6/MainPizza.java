package home_work_6;
import home_work_6.pizzeria.*;

import java.util.Scanner;

public class MainPizza {

    public static void main(String[] args) {


        Pizzeria pizzeria = new Pizzeria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("____________________________Добро пожаловать в Скоростной Ромео домой________________________");
        System.out.println("____________________________Побробуйте одну из наших вкуснейщих пиц___________________________");
        System.out.println("____________________________Выберите пицу из меню ниже, указав номер позиции___________________ ");
        Order order1 = new Order();//Создали обект заказа
        boolean flag = false;

        do {
            System.out.println(pizzeria.takeMenu());// Предоставили меню
            System.out.println("Сделайте выбор : ");
            int order = scanner.nextInt();// Сохранили знаачение введеное пользавателем
            System.out.println("Укажите колличество пиццы ");
            int a = scanner.nextInt();// Сохранили знаачение введеное пользавателем количкства пицццы
            order1.add(pizzeria.takeMenu().getItems().get(order), a);// Добавили пиццу в заказ
            System.out.println("Желаите еще пиццы нажмите - '1' \n Для оформления заказа нажмите 2 ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                flag = true;
            }
        } while (flag) ;
        pizzeria.create(order1);

        pizzeria.pickup(pizzeria.create(order1));
        System.out.println("Спасибо, ваш заказ принят\n Зака \n Хорошего дня");
    }

}












