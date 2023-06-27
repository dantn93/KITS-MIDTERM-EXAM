package Lab01;

public class Bai2 {
    public static String takeMiddle(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            int middleIndex = length / 2;
            return str.substring(middleIndex - 1, middleIndex + 1);
        } else {
            int middleIndex = length / 2;
            return str.substring(middleIndex, middleIndex + 1);
        }
    }

    public static void main(String[] args) {
        // "b"
        System.out.println(takeMiddle("abc"));
        System.out.println(takeMiddle("abcd"));
        // "c"
        takeMiddle("abecd"); // "e"
        System.out.println(takeMiddle("a"));
        // "a"
        // ""
        System.out.println(takeMiddle(""));

    }
}