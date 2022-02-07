package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String prefix = strs[0];
        for(String s : strs){
            int i = 0;
            int j = 0;
            while(i < prefix.length() && j < s.length() && prefix.charAt(i) == s.charAt(j)){
                i++;
                j++;
            }
            prefix = prefix.substring(0,j);
        }
        System.out.println(prefix);

    }
}
