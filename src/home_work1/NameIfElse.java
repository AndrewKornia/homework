package home_work1;

import java.util.Objects;
import java.util.Scanner;

public class NameIfElse {
    public static void main(String[] args) {
        System.out.println("Как вас зовут");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        String a ="Вася";
        String b = "Анастасия";
        if( Objects.equals( name , a)){
            System.out.println("Привет \n Я тебя так долго ждал");
        }else if( Objects.equals( name, b)){
            System.out.println("Я тебя тк долго ждал");
        }else {
            System.out.println("Ты кто");
        }
    }
}
