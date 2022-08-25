package home_wpork_3.calcs.additional;

import home_wpork_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic  extends CalculatorWithMathExtends {

   private int incrementCount;

    public long getCountOperation(){
        return incrementCount;
    }

    public void incrementCountOperation() {
        incrementCount+= 1;
    }
}
