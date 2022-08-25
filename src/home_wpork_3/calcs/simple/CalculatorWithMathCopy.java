package home_wpork_3.calcs.simple;


public class CalculatorWithMathCopy  {

    public double sum(double a, double b){
        double result = a + b;
        return result;
    }
    public double subtraction(double a ,double b ){
        double result = a - b ;
        return result;

    }
    public double multiplication(double a , double b){
        double result = a * b ;
        return result;
    }
    public double division(double a , double b){
        double result = a / b ;
        return result;
    }
    public double exponentiation(double a , double b ){
        double result = Math.pow(a,b);
        return result;
    }
    public double module(double a ){
        double result = Math.abs(a);
        return result;

    }

    public double rootOfNumber(double a ){
        double result = Math.sqrt(a);
        return result;

    }

}
