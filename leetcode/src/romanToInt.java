import java.util.Arrays;

public class romanToInt {

    public static void main(String[] args) {

      String A=  "MCMXCIV";
        romanToIn(A);
    }

    private static int romanToIn(String roman) {

        char[] arr = roman.toCharArray();
        int[] intcrr = new int[15];
        int i = 0;
        for (char c : arr) {
            //I             1
            // V             5
            //   X             10
            //   L             50
            //   C             100
//            D             500
//            M             1000

            switch (c) {
                case 'I':
                    intcrr[i++] = 1;
                    break;
                case 'V':
                    intcrr[i++] = 5;
                    break;
                case 'X':
                    intcrr[i++] = 10;
                    break;
                case 'L':
                    intcrr[i++] = 50;
                    break;
                case 'C':
                    intcrr[i++] = 100;
                    break;
                case 'D':
                    intcrr[i++] = 500;
                    break;
                case 'M':
                    intcrr[i++] = 1000;
                    break;
                default:
                break;
            }
        }

        System.out.println(Arrays.toString(intcrr));
        return 0;
    }
}
