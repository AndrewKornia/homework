package home_work2.loops;


public class MultiplyNumbers {
    public static void main(String[] args) {
        int number = Integer.parseInt("10");
        int sum = 1;
        System.out.print("1");
        for(int chet=2;chet<=number;chet++) {
            sum *= chet;
            System.out.print("*"+chet);
        }
        System.out.print("="+sum);
    }
}







