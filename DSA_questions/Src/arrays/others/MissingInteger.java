package arrays.others;

import java.util.HashSet;

public class MissingInteger {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 4, 7};
        System.out.println(solution(a));
    }

    private static Integer solution(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= a.length + 1; i++) {
            set.add(i);
        }

        for (int e : a) {
            set.remove(e);
        }

        return set.iterator().next();
    }
}
