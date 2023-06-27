package String;

public class bai2 {
    public static void main(String[] args) {
        String takeMiddle = ("abc");
        
    }

    public static String MiddleChar(String str) {
        int middle = str.length() / 2;
        if (str.length() % 2 == 0) {
            return str.substring(middle - 1, middle + 1);
        } else {
            return str.substring(middle, middle + 1);
        }
    }
}
