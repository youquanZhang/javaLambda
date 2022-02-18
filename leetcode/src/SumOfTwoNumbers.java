import java.util.Arrays;
import java.util.HashMap;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] numbers = numbers(nums, target);
        System.out.println(Arrays.toString(numbers));
        int[] nums1 = {3, 2, 4};
        int target1 = 6;
        int[] numbers1 = numbers(nums1, target1);
        System.out.println(Arrays.toString(numbers1));


        int[] nums2 = {2, 7, 11, 15};
        int target2 = 9;
        int[] numbers2 = numbers2(nums2, target2);
        System.out.println(Arrays.toString(numbers2));
        int[] nums3 = {3, 2, 4};
        int target3 = 6;
        int[] numbers3 = numbers2(nums3, target3);
        System.out.println(Arrays.toString(numbers3));

        int f=4;//100
        //1
        //10
        //11
        //100
        //101
        //110
        //111
        //1000

        int g=6;//110

        System.out.println(f&g);
        System.out.println(f&2);
        System.out.println(f|g);
        System.out.println(f|2);
        System.out.println(f>>1);
        System.out.println(f<<1);
        System.out.println(f&0);
        System.out.println(f|0);
        System.out.println(g&0);
        System.out.println(g|0);

    }

    public static int[] numbers(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            int c = a[i];
            for (int j = 0; j < a.length; j++) {
                int d = a[j];
                if (((c + d) == b) && i != j) {
                    int[] e = {i, j};
                    return e;
                }
            }
        }
        return null;
    }
//做查存到map里，每次取出来判断

    public static int[] numbers2(int[] a, int b) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int c = a[i];
            integerIntegerHashMap.get(a[i]);
            if (integerIntegerHashMap.get(c) != null) {
                int[] e = {i, (int)integerIntegerHashMap.get(a[i])};
                return e;
            }
            integerIntegerHashMap.put((b - a[i]), i);
        }
        return null;
    }
}
