package String.BT2;

public class BT2 {
    public static void main(String[] args) {
        takeMiddle("abc"); // "b"
        takeMiddle("abcd"); // "c"
        takeMiddle("abecd"); // "e"
        takeMiddle("a"); // "a"
        takeMiddle(""); // ""
    }

    public static void takeMiddle(String str) {
        String[] splitStr = str.split("");
        String result = "";
        for (int i = 0; i < splitStr.length; i++) {

            if (splitStr.length % 2 == 1) {
                result = splitStr[splitStr.length / 2];

            } else {
                result = splitStr[splitStr.length / 2];
            }

        }
        System.out.println(result);
    }
}
