public class longestCommonPrefix {

    public static void main(String[] args) {

//        String a = "asdc";
       String b = "asdcd";
       b.indexOf("");
//        System.out.println(a.indexOf(b));
//
//        String[] c = {"dog", "dogracecar", "car"};
//        System.out.println(longestCommonPrefix(c));
//        String[] d = {"a"};
//        System.out.println(longestCommonPrefix(d));
//        String[] f = {"ab", "a"};
//        System.out.println(longestCommonPrefix(f));
//        String[] g = {"flower", "flow", "flight"};
//        System.out.println(longestCommonPrefix(g));
//     String[] k = {"a","a","b"};
//    System.out.println(longestCommonPrefix(k));
//
         StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.append("asdcd").reverse());

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length <= 1) {
            return strs[0];
        }
        String A = "";
        String B = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                A = strs[i];
            }
            if (i > 0) {
                String b = strs[i];
                for (int i1 = 0; i1 < strs[0].length(); i1++) {
                    if (b.indexOf(A) == 0) {
                        break;
                    }
                    A = A.substring(0,  A.length() - 1);
                }
            }
        }


        return A;
    }
}
