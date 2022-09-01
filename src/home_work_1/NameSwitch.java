package home_work_1;

import java.util.Scanner;

public class NameSwitch {

    public static void main(String[] args) {
        System.out.println("Как вас зовут");
        Scanner console = new Scanner(System.in);
        String  name = console.nextLine();

        switch (name){
            case ("Вася"):
                System.out.println("Привет \n Я тебя так долго ждал");
                break;
            case ("Анастасия"):
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Ты кто");

        }
    }
}
