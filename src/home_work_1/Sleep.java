package home_work_1;

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
        System.out.println("Сегогдя  рабочий день? ");
        Scanner console = new Scanner(System.in);
        boolean weeKDay = console.nextBoolean();
        System.out.println("Вы в отпуске?");
        boolean vacation = console.nextBoolean();
        boolean result= checkFreeOrNot(weeKDay, vacation);
        if(result){
            System.out.println("Нужно идти на работу");
        }else{
            System.out.println("Спать дальше");
        }
    }
    static boolean checkFreeOrNot(boolean weekDay, boolean vacation) {
        return weekDay||!vacation;
    }
}





