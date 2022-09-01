package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {


        CalculatorWithCounterClassic Calc4 = new CalculatorWithCounterClassic();


        double result = Calc4.multiplication(15, 7);
        Calc4.incrementCountOperation();
        double result1 = Calc4.sum(result, 4.1);
        Calc4.incrementCountOperation();
        double result2 = Calc4.division(28, 5);
        Calc4.incrementCountOperation();
        double result3 = Calc4.exponentiation(result2, 2);
        Calc4.incrementCountOperation();
        double result4 = Calc4.sum(result1, result3);
        Calc4.incrementCountOperation();


        System.out.println("Результат умножения 15 * 7  = "+result);
        System.out.println("Результат сложенимя"+result + "4.1 = "+ result1);
        System.out.println("Результат деления 28 * 5 = " + result2);
        System.out.println("Результат возведения в сетпень числа " + result2 + " в степень 2 = "+ result3);
        System.out.println("Результат суммы числел " + result1+ " + "+result3 + " = "+ result4 );
        System.out.println("Проделно операций "+Calc4.getCountOperation());



    }
}
