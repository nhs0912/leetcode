import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.StringTokenizer;

/**
 * 13. Roman to Integer
 * Easy
 * <p>
 * 1501
 * <p>
 * 2939
 * <p>
 * Favorite
 * <p>
 * Share
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II.
 * The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {


    public int romanToInt(String s) {
        char[] romans = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] numbers = new int[]{1, 5, 10, 50, 100, 500, 1000};

        //StringTokenizer st = new StringTokenizer(s);
        int sum = 0;
        //while(st.hasMoreTokens()){
        for (int i = 0; i < s.length(); i++) {
            int romanIndex = 0;
            char ch = s.charAt(i);
            for (int j = 0; j < romans.length; j++) {4
                if (romans[j]==ch) {
                    System.out.println("romans[i]====" + romans[j]);
                    System.out.println("ch====" + ch);
                    romanIndex = j;
                    break;
                }
                System.out.println("romanIndex ===="+ romanIndex);
            }
            sum += numbers[romanIndex];
        }



        //}

        return sum;

    }


    public void execute() {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        int result = romanToInt("XII");
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Solution().execute();
    }

}
