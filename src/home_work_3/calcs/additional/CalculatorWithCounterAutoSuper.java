package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

     private long countOperation;

      public long getCountOperation(){
        return countOperation;
    }

    public double sum(double a, double b) {
        countOperation++;
        return super.sum(a,b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return super.subtraction(a ,b );

    }

    public double multiplication(double a, double b) {
        countOperation++;
        return super.multiplication(a,b);
    }

    public double division(double a, double b) {
        countOperation++;
        return super.division(a,b);
    }

    public double exponentiation(double a, double b) {
        countOperation++;
        return super.exponentiation(a,b);
    }

    public double module(double a) {
        countOperation++;
        return super.module(a);

    }

    public double rootOfNumber(double a) {
        countOperation++;
        return super.rootOfNumber(a);
    }
}
