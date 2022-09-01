package home_work_3.runners;


import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain  {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();

        double result = calc3.multiplication(15 ,7);
        double result1 = calc3.sum(result,4.1);
        double result2 = calc3.division(28,5);
        double result3 = calc3.exponentiation(result2,2);
        double result4 = calc3.sum(result1,result3);

        System.out.println("Результат умножения 15 * 7  = "+result);
        System.out.println("Результат сложенимя"+result + "4.1 = "+ result1);
        System.out.println("Результат деления 28 * 5 = " + result2);
        System.out.println("Результат возведения в сетпень числа " + result2 + " в степень 2 = "+ result3);
        System.out.println("Результат суммы числел " + result1+ " + "+result3 + " = "+ result4 );


    }




}
