package Math;

public class PalindromeTest {
    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        // while( 1 < 1){
        //     10 % 10 = 0;
        //     10 / 10 = 1;
        //     0 * 10 + 1 = 01;
        // }

        // return (10 == 01);


        int x2 = 0;
        int x1 = x;
        int r = 0;
        int q = 0;
        while( x1 > 0 ){

            r =  x1 % 10 ; //1                    // 12 % 10 = 2            // r = 1%10 : 1
            q =  x1 / 10 ;  // 12                 // 12 / 10 = 1            // 1 / 10 = 0
            x2 = x2*10 + r ;  // 1.               // 1*10 + 2 = 12          // 12 * 10 + 1
            x1 = q;  // x1 = 12                   // x1 = 1                 // x1 = q

        }

        return x==x2;
    }
}
