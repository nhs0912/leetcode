import java.io.BufferedInputStream;

/**
 * 13. Roman to Integer
 * Easy
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
public class SolutionTest {

    enum ROMAN {

        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
        int value = 0;

        ROMAN(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public int romanToInt(String s) {
        int sum = 0;

        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {

                switch (s.charAt(i)) {
                    case 'I'://1
                        if (s.charAt(i + 1) == 'V') {
                            sum += ROMAN.V.value - ROMAN.I.value;
                            i++;
                        } else if (s.charAt(i + 1) == 'X') {
                            sum += ROMAN.X.value - ROMAN.I.value;
                            i++;
                        } else {
                            sum += ROMAN.I.value;
                        }
                        break;
                    case 'V'://5
                        sum += ROMAN.V.value;
                        break;
                    case 'X'://10
                        if (s.charAt(i + 1) == 'L') {
                            sum += ROMAN.L.value - ROMAN.X.value;
                            i++;
                        } else if (s.charAt(i + 1) == 'C') {
                            sum += ROMAN.C.value - ROMAN.X.value;
                            i++;
                        } else {
                            sum += ROMAN.X.value;
                        }
                        break;
                    case 'L'://50
                        sum += ROMAN.L.value;
                        break;
                    case 'C'://100
                        if (s.charAt(i + 1) == 'D') {
                            sum += ROMAN.D.value - ROMAN.C.value;
                            i++;
                        } else if (s.charAt(i + 1) == 'M') {
                            sum += ROMAN.M.value - ROMAN.C.value;
                            i++;
                        } else {
                            sum += ROMAN.C.value;
                        }
                        break;
                    case 'D'://500
                        sum += ROMAN.D.value;
                        break;
                    case 'M'://1000
                        sum += ROMAN.M.value;
                        break;
                }

                if (i == s.length() - (i + 1)) {
                    switch (s.charAt(i + 1)) {
                        case 'I'://1
                            sum += ROMAN.I.value;
                            break;
                        case 'V'://5
                            sum += ROMAN.V.value;
                            break;
                        case 'X'://10
                            sum += ROMAN.X.value;
                            break;
                        case 'L'://50
                            sum += ROMAN.L.value;
                            break;
                        case 'C'://100
                            sum += ROMAN.C.value;
                            break;
                        case 'D'://500
                            sum += ROMAN.D.value;
                            break;
                        case 'M'://1000
                            sum += ROMAN.M.value;
                            break;

                    }
                    return sum;
                }
            }

        }else{
            int i=0;
            switch(s.charAt(i)){
                case 'I'://1
                    sum += ROMAN.I.value;
                    break;
                case 'V'://5
                    sum+= ROMAN.V.value;
                    break;
                case 'X'://10
                    sum+=ROMAN.X.value;
                    break;
                case 'L'://50
                    sum+=ROMAN.L.value;
                    break;
                case 'C'://100
                    sum+=ROMAN.C.value;
                    break;
                case 'D'://500
                    sum+=ROMAN.D.value;
                    break;
                case 'M'://1000
                    sum+=ROMAN.M.value;
                    break;
            }
        }
        return sum;
    }


    public void execute() {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        int result = romanToInt("X");
        System.out.println(result);
    }

    public static void main(String[] args) {
        new SolutionTest().execute();
    }

}
