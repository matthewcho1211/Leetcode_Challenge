package leetcode;

public class Roman_to_Integer {
    public int romanToTnt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && getValue(s.charAt(i)) < getValue(s.charAt(i + 1))) {
                total -= getValue(s.charAt(i));
            } else {
                total += getValue(s.charAt(i));
            }
        }
        return total;
    }
    public int getValue(Character ch){
        switch (ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
}
