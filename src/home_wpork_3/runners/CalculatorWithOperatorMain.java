package home_wpork_3.runners;

import home_wpork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {


        /**
         * Создали обьекта (экземпляр) и с помощью методов которые содержаться в данном экзземпляре  посчитаем наш пример  4.1 + 15 * 7 + (28 / 5) ^ 2;
         */
        CalculatorWithOperator Calc1 = new CalculatorWithOperator();


        double result = Calc1.multiplication(15 ,7);
        double result1 = Calc1.sum(result,4.1);
        double result2 = Calc1.division(28,5);
        double result3 = Calc1.exponentiation(result2,2);
        double result4 = Calc1.sum(result1,result3);

        System.out.println("Результат умножения 15 * 7  = "+result);
        System.out.println("Результат сложенимя"+result + "4.1 = "+ result1);
        System.out.println("Результат деления 28 * 5 = " + result2);
        System.out.println("Результат возведения в сетпень числа " + result2 + " в степень 2 = "+ result3);
        System.out.println("Результат суммы числел " + result1+ " + "+result3 + " = "+ result4 );

    }
}
