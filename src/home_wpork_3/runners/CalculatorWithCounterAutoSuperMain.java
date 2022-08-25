package home_wpork_3.runners;

import home_wpork_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper Calc5 = new CalculatorWithCounterAutoSuper();


        double result = Calc5.multiplication(15 ,7);
        double result1 = Calc5.sum(result,4.1);
        double result2 = Calc5.division(28,5);
        double result3 = Calc5.exponentiation(result2,2);
        double result4 = Calc5.sum(result1,result3);

        System.out.println("Результат умножения 15 * 7  = "+result);
        System.out.println("Результат сложенимя"+result + "4.1 = "+ result1);
        System.out.println("Результат деления 28 * 5 = " + result2);
        System.out.println("Результат возведения в сетпень числа " + result2 + " в степень 2 = "+ result3);
        System.out.println("Результат суммы числел " + result1+ " + "+result3 + " = "+ result4 );
        System.out.println(Calc5.getCountOperation());

    }
}
