package home_work_1;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        System.out.println("Введите число определяющее буквенный символ по таблице кодировки ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if(65<=number&number<=93){
            System.out.println("Буквенный символ");
        } else if (97<=number&number<=122) {
            System.out.println("Буквенный символ");
        }else {
            System.out.println("Иной символ, сории");
        }
    }
}
