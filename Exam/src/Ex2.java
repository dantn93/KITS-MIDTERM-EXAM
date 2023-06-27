public class Ex2 {
    public static void main(String[] args) {
        System.out.println(takeMiddle("abc")); // "b"
        System.out.println(takeMiddle("abcd")); // "c"
        System.out.println(takeMiddle("abecd")); // "e"
        System.out.println(takeMiddle("a")); // "a"
        System.out.println(takeMiddle("")); // ""
    }

    public static String takeMiddle(String str) {
        int length = str.length();

        if (length == 0) {
            return "";
        }

        int middleIndex = length / 2;

        if (length % 2 == 0) {
            return str.substring(middleIndex , middleIndex + 1);
        } else {
            return str.substring(middleIndex, middleIndex + 1);
        }
    }
}

