package edu.handong.csee.java.hw2.math;

/**
 * Math calculator with some basic math formulas. Currently, there are 13 math formula methods implemented.
 */
public class MathCalculator {

    /**
     * Name of the calculator. This is used to dertermine who is using the calculator.
     * Default value is "", an empty string.
     */
    private String name = "";

    /**
     * Sets the name of the calculator.
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Gets the name of the calculator.
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the larger of num1 and num2.
     */
    public int getMax(int num1, int num2){
        return (num1 > num2)?num1:num2;
    }

    /**
     * Returns the smaller of num1 and num2.
     */
    public int getMin(int num1, int num2){
        return (num1 < num2)?num1:num2;
    }

    /**
     * Returns the absolute value of given integer number.
     */
    public int getAbs(int num){
        return (num<0)?num*-1:num;
    }

    /**
     * Returns the sum of num1 and num2.
     */
    public int getSum(int num1, int num2){
        return num1 + num2;
    }

    /**
     * Returns the difference between num1 and num2.
     * The result of num1-num2 is returned.
     */
    public int getDiff(int num1, int num2){
        return num1 - num2;
    }

    /**
     * Returns the product of num1 and num2.
     */
    public int getProduct(int num1, int num2){
        return num1 * num2;
    }

    /**
     * Returns the quotient of num1 divided by num2.
     */
    public int getQuotient(int num1, int num2){
        return num1/num2;
    }

    /**
     * Returns the remainder of num1 divided by num2.
     */
    public int getRemainder(int num1, int num2){
        return num1%num2;
    }

    /**
     * Returns the num1 to the power of num2.
     */
    public int getPower(int num1, int num2){
        if(num2 < 0) return 0;

        int power = 1;
        for(int i=0; i<num2; i++){
            power *= num1;
        }
        return power;
    }

    /**
     * Returns the factorial of num.
     */
    public int getFactorial(int num){
        if(num<0) return 0;

        int factorial = 1;
        for(int i=1; i<=num; i++){
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Returns the Greatest Common Divisor(GCD) of num1 and num2.
     * GCD is also known as Highest Common Factor
     * Internally, it uses the "long division" method.
     */
    public int getGcd(int num1, int num2){
        num1 = getAbs(num1);
        num2 = getAbs(num2);
        int dividend = getMax(num1, num2);
        int divisor = getMin(num1, num2);
        int quotient, remainder, Gcd=-1;

        // dividend = divisor*quotient + remainder
        while(true){
            remainder = 0;
            quotient = 1;
            while(divisor*quotient <= dividend){
                quotient++;
            }
            quotient--;
            remainder = dividend-(divisor*quotient);
            // debug:
            // System.out.println(remainder + "=" + dividend + "-" +"(" + divisor + "*" + quotient + ")");
            if(remainder==0){
                Gcd = divisor;
                break;
            }
            dividend = divisor;
            divisor = remainder;
        }
        return Gcd;
    }

    /**
     * Returns the Least Common Multiple(LCM) of num1 and num2.
     */
    public int getLcm(int num1, int num2){
        return (num1 * num2)/getGcd(num1, num2);
    }

    /**
     * Returns the square of num.
     */
    public int getSquare(int num){
        return num*num;
    }
}