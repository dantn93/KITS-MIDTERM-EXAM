public class String_exe2 {
    public static void main(String[] args) {
        System.out.println(takeMiddle("abc"));
        System.out.println(takeMiddle("abcd"));
        System.out.println(takeMiddle("abecd"));
        System.out.println(takeMiddle("a"));
        System.out.println(takeMiddle(" "));
    }

    public static String takeMiddle(String str) {
        int length = str.length();
        int middle = length / 2;
        if (length == 0) {
            return " ";
        }  else {
            return str.substring(middle, middle + 1);
        }
    }
}