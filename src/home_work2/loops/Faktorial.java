package home_work2.loops;


public class Faktorial {
    public static void main(String[] args) {
        byte number = Byte.parseByte(args[0]);
        String result = result(number,sum(number));;
        System.out.println(result);
    }

        public static int sum(int number){
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;

        }
        return sum;
    }

    public static String result (int number,int sum){
        String result = "";
        for (int i =1;i<=number;i++){
            result+=i;
            if(i!=number){
                result+=" * ";
            }
        }
        return result+" = "+sum;
    }
}







