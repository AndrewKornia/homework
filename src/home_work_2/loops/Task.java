package home_work_2.loops;



public class Task {
    public static void main(String[] args) {
        //public static int maxNumber - метод для получения максимального числа и ввведнгого пользователем числа
        //public static void evenAndOdd- метод для получения четных и не четных чисел от числа введеныи пользователем
        //public static int probabilitOfNumbers- метод для подсчета вероятнвх  четных чисел от
        //public static int numberFlip-метод переварачивает число
        //stepInDeapozons - метод шшаг в дипозоне
        // fibonache-медот с чисдои фибоначе



    }
    public static int maxNumber(int number){
         int max = number%10;
         number/=10;
         while (number>0){
             if(number%10>max) {
                 max = number % 10;
             }
             number/=10;
         }
         return max;
    }

    public static void evenAndOdd (long number){
        long even = 0;
        long add = 0;
        while (number>0){
            if(number%2==0) {
                even++;
            }else{
                add++;
            }
            number/=10;
        }
        System.out.println("Четных числе"+"="+even);
        System.out.println("Не четныйх чесел"+"="+add);

    }

    public static int OfNumbers(int number ){
        int checkEventNubmer=0;
        for(int i =0;number>0;i++){
            int randomNumber= (int)(Math.random()*100);
            if(randomNumber%2==0){
                checkEventNubmer++;
            }
        }
        checkEventNubmer =checkEventNubmer/number*100;
        return checkEventNubmer;
    }
    public static int numberFlip(int number){
        int result = 0;
        int i = 0;
        while (number>0) {
            i = number % 10;
            number/=10;
            result=(result+i)*10;
        }
        result/=10;
        return result;
    }

    public static void stepInDeapozons(int min, int max, int step) {

        for (int i =min;i<=max;i+=step) {
            System.out.println(i);
        }

    }
    public static void fibonache(int a ){
        int x = 1;
        int y = 2;
        for(int i = 3;a > i;i++){
            System.out.print(x+" ");
            System.out.print(y+" ");
            x=x+y;
            y=x+y;
        }
    }
}

