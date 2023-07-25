package Math;

import java.math.BigInteger;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        //    num1.        num2.      prod
        //case 1 :      0             0
        //case 2 :      0>            0
        //case 3 :      0>            0.
        //case 4 :      0>            0>.     single digit
        //case 5 :      0>            0>.     double digit
        //case 6 :      0>            0>.     triple digit ........so on


        BigInteger number1 = BigInteger.ZERO;
        BigInteger number2 = BigInteger.ZERO;
        for (char s : num1.toCharArray()) {
            long r = (s - '0');
            number1 = number1.multiply(BigInteger.TEN).add(BigInteger.valueOf(r));
        }

        for (char s : num2.toCharArray()) {
            long r = (s - '0');
            number2 = number2.multiply(BigInteger.TEN).add(BigInteger.valueOf(r));

        }
        String res = String.valueOf(number1.multiply(number2));
        return res;
    }

    public static String multiply2(String num1, String num2) {
            int n1 = num1.length(), n2 = num2.length();
            int[] products = new int[n1 + n2];
            for (int i = n1 - 1; i >= 0; i--) {
                for (int j = n2 - 1; j >= 0; j--) {
                    int d1 = num1.charAt(i) - '0';
                    int d2 = num2.charAt(j) - '0';
                    products[i + j + 1] += d1 * d2;
                }
            }
            int carry = 0;
            for (int i = products.length - 1; i >= 0; i--) {
                int tmp = (products[i] + carry) % 10;
                carry = (products[i] + carry) / 10;
                products[i] = tmp;
            }
            StringBuilder sb = new StringBuilder();
            for (int num : products) sb.append(num);
            while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
            return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123456789", "987654321"));
        System.out.println(multiply2("123456789", "987654321"));
    }
}
