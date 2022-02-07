package leetcode;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,10};
        int[] output = twoSum(nums, 12);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }
    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int[] list = {i, j};
                    return list;
                }
            }
        }
        return null;
    }
}
