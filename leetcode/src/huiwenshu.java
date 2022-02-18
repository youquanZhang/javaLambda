public class huiwenshu {
    public static void main(String[] args) {
        int a = -121;
        System.out.println(huiwenshu(a));
    }

    public static boolean huiwenshu(int a) {
        String str = String.valueOf(a);
        char[] arry = str.toCharArray();
        for (int i = 0; i < arry.length/2; i++) {
            if ((arry[i] != arry[(arry.length-1) - i])) {
                return false;
            }
        }
        return true;
    }
}
