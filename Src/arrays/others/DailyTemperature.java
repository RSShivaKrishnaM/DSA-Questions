package arrays.others;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperature {
	public int[] dailyTemperatures1(int[] temperatures) {
        //pointer one pointing to current day temp
        // pointer two traversing remaing temperatures to find next heigh temp compared to currrent day temp
        // keep a count till second pointer is satisfying the condition
        // if(temperatures==null || temperatures.length==1){
        //     return;
        // }
        int currTepm = temperatures[0];
        int res[] = new int[temperatures.length];
        int resIndex =0;
        int count = 0;
        int curr = 0;
        // for(int curr = 0 ; curr < temperatures.length-1; curr++){
            count = 1;
            for(int i = curr+1; i < temperatures.length ; i++){
                    if(temperatures[curr]<temperatures[i] || count==(temperatures.lenght-i)) {
                        res[curr] = count;
                        curr++;
                        count=1;
                        break;
                    }else{
                        count++;
                    }            
            }    
        // }
        return res;
    }
   public int[] dailyTemperatures2(int[] temp) {

  
     Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temp.length];
        for(int i=0;i<temp.length;i++) {
            while (!stack.isEmpty() && temp[stack.peek()]<temp[i]) {
                result[stack.peek()] = i-stack.pop();
            }
            stack.push(i);
        }
        
        return result;
    }
}

