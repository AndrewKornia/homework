package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private CalculatorWithOperator calc;
    private CalculatorWithMathExtends calc1;
    private CalculatorWithMathCopy calc2;


    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc) {
        this.calc = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc) {
        this.calc1 = calc;

    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc) {
        this.calc2 = calc;
    }
    private long countOperation;
    public long getCountOperation() {
        return countOperation;
    }

    public double sum(double a, double b) {
        if(this.calc!=null){
            return this.calc.sum(a,b);
        }else if(this.calc1!=null){
            return this.calc1.sum(a,b);
        }else {

            return this.calc2.sum(a,b);
        }

    }

    public double subtraction(double a, double b) {
        if(this.calc!=null){
            return this.calc.sum(a,b);
        }else if(this.calc1!=null){
            return this.calc1.sum(a,b);
        }else {
            countOperation++;
            return this.calc2.sum(a,b);
        }
    }

    public double multiplication(double a, double b) {
        if(this.calc!=null){
            return this.calc.multiplication(a,b);
        }else if(this.calc1!=null){
            return this.calc1.multiplication(a,b);
        }else {
            countOperation++;
            return this.calc2.multiplication(a,b);
        }
    }

    public double division(double a, double b) {
        if(this.calc!=null){
            return this.calc.division(a,b);
        }else if(this.calc1!=null){
            return this.calc1.division(a,b);
        }else {
            countOperation++;
            return this.calc2.division(a,b);
        }
    }

    public double exponentiation(double a, double b) {
        if(this.calc!=null){
            return this.calc.exponentiation(a,b);
        }else if(this.calc1!=null){
            return this.calc1.exponentiation(a,b);
        }else {
            countOperation++;
            return this.calc2.exponentiation(a,b);
        }
    }

    public double module(double a) {
        if(this.calc!=null){
            return this.calc.module(a);
        }else if(this.calc1!=null){
            return this.calc1.module(a);
        }else {
            countOperation++;
            return this.calc2.module(a);
        }
    }

    public double rootOfNumber(double a) {
        if(this.calc!=null){
            return this.calc.rootOfNumber(a);
        }else if(this.calc1!=null){
            return this.calc1.rootOfNumber(a);
        }else {
            countOperation++;
            return this.calc2.rootOfNumber(a);
        }
    }

}