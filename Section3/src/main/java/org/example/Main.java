package org.example;

public class Main {
    public static void main(String[] args) {
       double fistVariableValue = 20.00d;
       double secondVariableValue = 80.00d  ;
       double myValueTotal =   fistVariableValue+secondVariableValue *100.00d;
        System.out.println("My total value :"+myValueTotal);
        double theRemainder = myValueTotal % 40.00d;
        System.out.println(theRemainder);
        boolean isNotRemainder = theRemainder == 0 ? true :false;
        if (!isNotRemainder)
            System.out.println("got some Remainder");
    }
    }