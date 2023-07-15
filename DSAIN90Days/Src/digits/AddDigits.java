package digits;

public class AddDigits {
    public int addDigits(int num){

        int res = fun(num);
        while(true){
            if(res % 10 == res){
                return res;
            } else {
                res = fun(res);
            }
        }

    }

    public int fun(int num){
        int res = 0;
        while( num > 0 ){
            res += num % 10;
            num = num / 10;
        }
        return res;
    }


    // python code by Mouni (my wife)
    /*
    def addDigits(self, num: int) -> int:
        while len(str(num)) != 1:
            val = 0
            for i in range(len(str(num))):
                val = val + num%10
                num = num//10
            num = val
        return num
     */
}
