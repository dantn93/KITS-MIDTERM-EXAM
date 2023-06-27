package String.BT3;

public class BT3 {
    public static void main(String[] args) {
        takeOddOnly("xyz"); // ["x", "z"]
        takeOddOnly("abcd"); // ["a", "c"]
        takeOddOnly(""); // []
    }

    public static void takeOddOnly(String str) {
        String[] splitStr = str.split("");
        String result = "";
        String result0 = "";
        for (int i = 0; i < splitStr.length; i++) {
            if (i % 2 != 0) {
                result0 = splitStr[0];
                result = splitStr[i];
            }
        }
        System.out.println(result0 + result);
    }
}
