package home_work1;

public class BitOperation {
    public static void main(String[] args) {

        int number1,number2;
        number1 = 36;
        number2 = 7;
        int not = ~number1;
        int xor = number1^number2;//   100100^000111=100011
        int and = number1&number2;//   100100&000111=000100
        int or = number1|number2;
        int shiftL = number1<<number2;
        int shiftR =number1>>number2;
        int shiftZero=number1>>>number2;

        System.out.println("побитовы унарный оператор 'NOT' для числа 36 " + not);
        System.out.println("Побитовые операция с числами:\n ПОбитовое исключающее " +xor);
        System.out.println("Побитовое 'AND' "+ and);
        System.out.println("Побитовое 'OR' "+ or);
        System.out.println("Сдвиг влево " + shiftL);
        System.out.println("Сдвиг вправо "+shiftR);
        System.out.println("Сдвиг вправо с заполнением нулями "+shiftZero)
        ;
    }
}

