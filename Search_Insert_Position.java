package leetcode;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] list = {1,3,5,6};
        System.out.println(searchInsert(list, 8));
    }
    public static int searchInsert(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }else if(target < nums[i]){
                return i;
            }
        }
        return nums.length;
    }


}
