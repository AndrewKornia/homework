package home_wpork_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

    public double exponentiation(double a, double b ){
        double result = Math.pow(a , b );
        return result;
    }
    public double   module(double a ){
        double result = Math.abs(a);
        return result;

    }
    public double rootOfNumber(double a){
        double result = Math.sqrt(a);
        return result;


    }



}
