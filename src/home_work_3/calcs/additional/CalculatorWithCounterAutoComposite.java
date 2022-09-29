package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {

    private CalculatorWithMathCopy calc2 ;

    public CalculatorWithCounterAutoComposite(){
        this.calc2 = new CalculatorWithMathCopy();
    }
    private long countOperation;
    public long getCountOperation() {
        return countOperation;
    }

    public double sum(double a, double b){
        countOperation++;
        return this.calc2.sum(a , b);
    }
    public double subtraction(double a ,double b ){
        countOperation++;
        return this.calc2.subtraction(a , b );
    }
    public double multiplication(double a , double b){
        countOperation++;
        return this.calc2.multiplication(a , b);
    }
    public double division(double a , double b){
        countOperation++;
        return this.calc2.division(a , b );
    }
    public double exponentiation(double a , double b ){
        countOperation++;
        return this.calc2.exponentiation(a , b );
    }
    public double module(double a ){
        countOperation++;
        return this.calc2.module(a);
    }
    public double rootOfNumber(double a ){
        countOperation++;
        return this.calc2.rootOfNumber(a);
    }
}












