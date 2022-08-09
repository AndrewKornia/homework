package home_work1;

import java.util.Scanner;

public class ByteKilobyte {
    public static void main(String[] args) {
        System.out.println("Перевести:\n 1- Byte/KByte\n 2-KByte/Byte");
        Scanner console = new Scanner(System.in);
        int choice = console.nextInt();
        switch (choice){
            case 1:
                System.out.println("Введите число");
                int bYte = console.nextInt();
                System.out.println("В "+bYte+"byte = "+(bYte/1024d)+"KByte");
                break;
            case 2:
                System.out.println("Введите число");
                int kByte = console.nextInt();
                System.out.println("В "+kByte +"kByte = "+(1024*kByte)+"byte");
        }
    }
}
