package Java;

public class baitap1 {
    public static void main(String[] args) {
        takeHeadAndTail("abc");
        takeMiddle("abc");
        takeOddOnly("xyzwere");
    }

    //cau 1
    public static char[] takeHeadAndTail(String str) {
    char[] result = str.toCharArray();
    char[] firstAndLast = {result[0], result[result.length - 1]};
    return firstAndLast;
}

    //cau 2
    public static void takeMiddle(String str){
        int len = str.length();
        if(len % 2 == 0){
            System.out.println(str.substring(len/2-1, len/2+1));
        }
        else{
            System.out.println(str.substring(len/2+1, len/2+1));
        }
    }

    //cau 3
    public static String takeOddOnly(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        if (i % 2 != 0) {
            result.append(str.charAt(i));
        }
    }
    return result.toString();
}

}
