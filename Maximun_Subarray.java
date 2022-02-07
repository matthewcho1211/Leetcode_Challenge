package leetcode;

public class Maximun_Subarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int soFar = nums[0], tillNow = nums[0], i=1;
        while(i<nums.length) {
            tillNow = Math.max(tillNow + nums[i], nums[i]);
            soFar = Math.max(soFar, tillNow);
            i++;
        }
        System.out.println(soFar);

    }
}
