package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator calc;
    private long countOperation;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc ) {
        this.calc=calc;
    }
    public long getCountOperation(){
        return countOperation;
    }
    public double sum(double a, double b){
        countOperation++;
        return this.calc.sum(a,b);
    }


    double subtraction(double a, double b){
        countOperation++;
        return this.calc.subtraction(a,b);
    }

    public double multiplication(double a, double b){
        countOperation++;
        return this.calc.multiplication(a,b);
    }

    public double division(double a, double b){
        countOperation++;
        return this.calc.division(a,b);
    }

    public double exponentiation(double a, double b){
        countOperation++;
        return this.calc.exponentiation(a,b);
    }

    double module(double a){
        countOperation++;
        return this.calc.module(a);
    }

    double rootOfNumber(double a){
        countOperation++;
        return this.calc.rootOfNumber(a);
    }


}


