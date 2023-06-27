package NgoThanhTan_07.string;

public class Bai2 {
    public static String takeMiddle(String str) {
        String[] input = str.split("");
        int index = input.length / 2;

        return input[index];
    }

    public static void main(String[] args) {
        System.out.println(takeMiddle("abc"));
        System.out.println(takeMiddle("abcd"));
        System.out.println(takeMiddle("abecd"));
        System.out.println(takeMiddle("a"));
        System.out.println(takeMiddle(""));
    }
}
