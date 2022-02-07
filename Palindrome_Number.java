package leetcode;

public class Palindrome_Number {
    public static void main(String[] args) {
        int x = 313;
        String str = Integer.toString(x);
        StringBuilder strb = new StringBuilder(str);
        String new_str = strb.reverse().toString();
        if(new_str.equals(str)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
