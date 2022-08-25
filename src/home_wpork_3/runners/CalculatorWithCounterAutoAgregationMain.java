package home_wpork_3.runners;

import home_wpork_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_wpork_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        CalculatorWithCounterAutoAgregation calc1 = new CalculatorWithCounterAutoAgregation(calc);


        double result = calc1.multiplication(15 ,7);
        double result1 = calc1.sum(result,4.1);
        double result2 = calc1.division(28,5);
        double result3 = calc1.exponentiation(result2,2);
        double result4 = calc1.sum(result1,result3);

        System.out.println("Результат умножения 15 * 7  = "+result);
        System.out.println("Результат сложенимя"+result + "4.1 = "+ result1);
        System.out.println("Результат деления 28 * 5 = " + result2);
        System.out.println("Результат возведения в сетпень числа " + result2 + " в степень 2 = "+ result3);
        System.out.println("Результат суммы числел " + result1+ " + "+result3 + " = "+ result4 );
        System.out.println("Было совершено "+calc1.getCountOperation()+" коллиство операций");

    }
}
