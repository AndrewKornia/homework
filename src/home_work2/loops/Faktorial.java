package home_work2.loops;


public class Faktorial {
    public static void main(String[] args) {
        long number = Integer.parseInt("10");
        int sum = 1;
        System.out.print("1");
        for(int i=2;i<=number;i++) {
            sum *= i;
            System.out.print("*"+i);
        }
        System.out.print("="+sum);
    }
}







