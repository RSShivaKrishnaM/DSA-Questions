package Math;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;



        int count = 0;
        boolean neg = false;

        if(dividend == min){
            dividend = max;
        } else if (dividend < 0){
            dividend = dividend * -1;
            neg = true;
        }

        if(divisor < 0){
            divisor = divisor * -1;
            neg = !neg;
        }
        int remainder = dividend;
        while(remainder >= divisor){
            remainder = remainder - divisor;
            count++;
        }
        if(neg){
            count = count * -1;
        }
        return count;
    }

    public static void main(String[] args) {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        System.out.println(divideTwoIntegers.divide(-2147483648, -1));
    }
}
