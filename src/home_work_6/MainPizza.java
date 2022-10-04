package home_work_6;
import home_work_6.pizzeria.Menu;
import home_work_6.pizzeria.MenuRow;
import home_work_6.pizzeria.Order;
import home_work_6.pizzeria.PizzaInfo;

import java.util.Scanner;

public class MainPizza {

    public static void main(String[] args) {

        Menu menu = new Menu();
        System.out.println("____________________________Добро пожаловать в Скоростной Ромео домой________________________");
        System.out.println("____________________________Побробуйте одну из наших вкуснейщих пиц___________________________");
        System.out.println("____________________________Выберите пицу из меню ниже, указав номер позиции___________________ ");
        menu.addCreatePizza();
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        int order = scanner.nextInt();
        Order order1 = new Order();
        if(0<=order&&order<11){
            order1.add(new MenuRow(new PizzaInfo()));

        }











        }













}
