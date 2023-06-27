package String;

public class bai1 {
    public static void main(String[] args) {
        System.out.println(takeHeadAndTail("abc"));

    }

    public static String[] takeHeadAndTail(String str) {
        String[] arr = new String[2];
        if (str.length() == 0) {
            arr[0] = "";
            arr[1] = "";
        } else {
            String[] input = str.split(" ");
            arr[0] = input[0];
            arr[1] = input[input.length -1];
        }
        return arr;
    }
}
