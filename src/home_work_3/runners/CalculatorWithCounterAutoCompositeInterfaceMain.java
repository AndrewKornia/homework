package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        ICalculator cal = new CalculatorWithCounterAutoSuper();

        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(cal);


        double result = calc.multiplication(15 ,7);
        double result1 = calc.sum(result,4.1);
        double result2 = calc.division(28,5);
        double result3 = calc.exponentiation(result2,2);
        double result4 = calc.sum(result1,result3);

        System.out.println("Результат умножения 15 * 7  = "+result);
        System.out.println("Результат сложенимя"+result + "4.1 = "+ result1);
        System.out.println("Результат деления 28 * 5 = " + result2);
        System.out.println("Результат возведения в сетпень числа " + result2 + " в степень 2 = "+ result3);
        System.out.println("Результат суммы числел " + result1+ " + "+result3 + " = "+ result4 );
        System.out.println(calc.getCountOperation());


    }
}

