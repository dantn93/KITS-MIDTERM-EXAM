package String.BT1;

public class BT1 {
    public static void main(String[] args) {
        takeHeadAndTail("abc"); // ["a", "c"]
        takeHeadAndTail("a"); // ["a", "a"]
        takeHeadAndTail(""); // ["", ""]
    }

    public static void takeHeadAndTail(String str) {
        String[] splitArr = str.split("");
        for (int i = 0; i < splitArr.length; i++) {
            if (i == splitArr.length - 1) {
                System.out.println(splitArr[0] + splitArr[i]);
            }
        }
    }
}