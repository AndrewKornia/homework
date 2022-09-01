package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator c1 = new CalculatorWithOperator();
        CalculatorWithMathCopy c2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends c3 = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAgregation calc = new CalculatorWithCounterAutoChoiceAgregation(c1);
        double result = calc.multiplication(15 ,7);
        double result1 =calc.sum(result,4.1);
        double result2= calc.division(28,5);
        double result3 =calc.exponentiation(result2,2);
        double result4 =calc.sum(result1,result3);

        System.out.println("Результат умножения 15 * 7  = "+result);
        System.out.println("Результат сложенимя"+result + "4.1 = "+ result1);
        System.out.println("Результат деления 28 * 5 = " + result2);
        System.out.println("Результат возведения в сетпень числа " + result2 + " в степень 2 = "+ result3);
        System.out.println("Результат суммы числел " + result1+ " + "+result3 + " = "+ result4 );
        System.out.println("Было совершено "+calc.getCountOperation()+" коллиство операций");

        CalculatorWithCounterAutoChoiceAgregation calc2 = new CalculatorWithCounterAutoChoiceAgregation(c2);

        double res = calc.multiplication(15 ,7);
        double res1 =calc.sum(result,4.1);
        double res2= calc.division(28,5);
        double res3 =calc.exponentiation(result2,2);
        double res4 =calc.sum(result1,result3);

        System.out.println("Результат умножения 15 * 7  = "+result);
        System.out.println("Результат сложенимя"+result + "4.1 = "+ result1);
        System.out.println("Результат деления 28 * 5 = " + result2);
        System.out.println("Результат возведения в сетпень числа " + result2 + " в степень 2 = "+ result3);
        System.out.println("Результат суммы числел " + result1+ " + "+result3 + " = "+ result4 );
        System.out.println("Было совершено "+calc2.getCountOperation()+" коллиство операций");

        CalculatorWithCounterAutoChoiceAgregation calc3 = new CalculatorWithCounterAutoChoiceAgregation(c3);


        double rerest = calc.multiplication(15 ,7);
        double reres1 =calc.sum(result,4.1);
        double reres2= calc.division(28,5);
        double reres3 =calc.exponentiation(result2,2);
        double reres4 =calc.sum(result1,result3);

        System.out.println("Результат умножения 15 * 7  = "+result);
        System.out.println("Результат сложенимя"+result + "4.1 = "+ result1);
        System.out.println("Результат деления 28 * 5 = " + result2);
        System.out.println("Результат возведения в сетпень числа " + result2 + " в степень 2 = "+ result3);
        System.out.println("Результат суммы числел " + result1+ " + "+result3 + " = "+ result4 );
        System.out.println("Было совершено "+calc3.getCountOperation()+" коллиство операций");


    }

}
