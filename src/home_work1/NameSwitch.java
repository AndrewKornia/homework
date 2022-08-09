package home_work1;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Objects;
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
