package Math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int v : nums) {
            set.add(v);
        }
        int val = 0;
        int val_find = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            for(int j = i + 1; j < nums.length; j++){
                val = nums[i] + nums[j];
                val_find = val * -1;

//                set.
//                if(search(val_find, set.subset(j+1, nums.length-1))){
//                    List<Integer> list = new ArrayList<>();
//                    list.add(nums[i]);
//                    list.add(nums[j]);
//                    list.add(val_find);
//                    result.add(list);
//                }
            }
        }
        return result;
    }

    public boolean search(int val_find, Set<Integer> sett) {
        return (sett.contains(val_find));
    }
}
