import java.util.Arrays;

public class EX1 {

    public static String[] takeHeadAndTail(String str) {
        String[] headAndTail = new String[2];
        if (!str.isEmpty()) {
            String[] strs = str.split("");
            headAndTail[0] = strs[0];
            headAndTail[1] = strs[strs.length - 1];
            return headAndTail;
        }
        headAndTail[0] = "";
        headAndTail[1] = "";
        return headAndTail;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(takeHeadAndTail("abc")));
//        System.out.println(Arrays.toString(takeHeadAndTail("a")));
//        System.out.println(Arrays.toString(takeHeadAndTail("")) );
//        System.out.println(takeMiddle("abecd"));
        System.out.println(Arrays.toString(takeOddOnly("xyz")) );
    }

    public static String takeMiddle(String str){
        if(str.isEmpty())
            return "";
        int index = str.length() / 2;
        return String.valueOf(str.charAt(index));
    }

    public static String[] takeOddOnly(String str){
        int size = (int) Math.ceil( (double) str.length() / 2) ;
        String []result = new String[size];
        String []strs = str.split("");
        for(int i = 0 ; i < size; i ++){
            result[i] = strs[i];
        }
        return result;
    }
}
