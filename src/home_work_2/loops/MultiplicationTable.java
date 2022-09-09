package home_work_2.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("С кого числа начиная таблиуц  умножения");
        int startNumber = scanner.nextInt();
        System.out.println("Введите максимальное колличство столбцов в строке");
        int maxCountColumnsInPow = scanner.nextInt();
        System.out.println("ВВедите коллистчство столбцов в таблице умножения");
        int countColumns = scanner.nextInt();

        int countRow = (int)Math.ceil(countColumns/(double)maxCountColumnsInPow);
        System.out.println("Таблица умножения");
        for(int i = 0 ;i<countRow;i++){
            int currentTo =  startNumber+ maxCountColumnsInPow +(maxCountColumnsInPow*i)-1;
            int tmp = countColumns - (maxCountColumnsInPow*i);
            if(tmp<maxCountColumnsInPow){
                currentTo= startNumber+(maxCountColumnsInPow*i)+tmp -1;
            }
            printRow(startNumber+(maxCountColumnsInPow*i),currentTo);
            System.out.print("\n");
        }
    }
    /**
     * Печать строки с указаными столбцами
     *
     * @param from столбец с которого начинаетмя строка
     * @param to   столбец с которым заканчивается строка
     */
    public static void printRow(int from, int to) {
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                System.out.print(j + "x" + i + "=" + (j * i) + "\t");
            }
            System.out.print("\n");
        }
    }
}

