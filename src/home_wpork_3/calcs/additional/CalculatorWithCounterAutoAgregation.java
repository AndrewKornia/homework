package home_wpork_3.calcs.additional;


import home_wpork_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

        private CalculatorWithMathCopy calc;

        private long countOperation;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc) {
        this.calc = calc;

    }
    public long getCountOperation() {
            return countOperation;
        }

        public double sum(double a, double b) {
            countOperation++;
            return this.calc.sum(a, b);
        }

        public double subtraction(double a, double b) {
            countOperation++;
            return this.calc.subtraction(a, b);
        }

        public double multiplication(double a, double b) {
            countOperation++;
            return this.calc.multiplication(a, b);
        }

        public double division(double a, double b) {
            countOperation++;
            return this.calc.division(a, b);
        }

        public double exponentiation(double a, double b) {
            countOperation++;
            return this.calc.exponentiation(a, b);
        }

        public double module(double a) {
            countOperation++;
            return this.calc.module(a);
        }

        public double rootOfNumber(double a) {
            countOperation++;
            return this.calc.rootOfNumber(a);
        }
}

