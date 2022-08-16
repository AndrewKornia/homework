package home_work2.loops;
public class Number {
    public static void main(String[] args) {
        int number = Integer.parseInt("788864321");
        int a = 0;
        int i ;
        while (number>0){
            i =number%10;
            number/=10;
             a = (a + i)*10;
        }
        a  /=10;
        int result = 1;
        while(a>0){
         i=a%10;
         a/=10;
         String str ="*"+i;
          result*=i;
            System.out.print(str);
        }
        System.out.println("="+result);
    }
}

