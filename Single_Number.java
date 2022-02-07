package leetcode;

import java.util.ArrayList;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int result = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list1.contains(list.get(i))){
                list1.remove(list.get(i));
            }else{
                list1.add(list.get(i));
            }
        }
        System.out.println(list1.get(0));

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        System.out.println(result);

    }
}
